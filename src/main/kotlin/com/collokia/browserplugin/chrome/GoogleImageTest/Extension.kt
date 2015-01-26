package com.collokia.browserplugin.chrome.GoogleImageTest

import kotlin.js.dom.html.document
import kotlin.js.dom.html.HTMLDocument
import kotlin.js.dom.html.HTMLImageElement

// This is a port of this sample: https://developer.chrome.com/extensions/getstarted

native fun encodeURIComponent(str: String): String = noImpl

// native("chrome")
// val chrome: dynamic = noImpl
//
// you COULD use this to call chrome API's without any type safety, or you can declare things like follows:

public native object chrome {
    public native object tabs {
        public native trait Tab {
            public var status: String?
            public var index: Number
            public var openerTabId: Number?
            public var title: String?
            public var url: String?
            public var pinned: Boolean
            public var highlighted: Boolean
            public var windowId: Number
            public var active: Boolean
            public var favIconUrl: String?
            public var id: Number
            public var incognito: Boolean
        }

        public fun query(queryInfo: Any, callback: (result: Array<Tab>) -> Unit): Unit = noImpl
    }
}

public class chrome_tabs_CurrentTabQuery() {
    val active = true;
    val currentWindow = true
}

// TODO: don't know why kotlin removed this, probably because it is more complicated to create one than just allocating depending on old browsers.  They could keep the trait though
public native("XMLHttpRequest") class TempXMLHttpRequest() {
    public fun open(method: String, url: String): Unit = noImpl
    public fun send(): Unit = noImpl
    public var responseType: String = noImpl
    public var onload: () -> Unit = noImpl
    public var onerror: () -> Unit = noImpl
    public var response: dynamic = noImpl   // this is dynamic because it can be about anything when JSON, so don't fight the dyanmicness!
}

// TODO: missing in Kotlin DOM
native fun HTMLDocument.addEventListener(event: String, function: () -> Unit): Unit = noImpl



fun getImageUrl(searchTerm: String, successCallback: (url: String, width: Int, height: Int) -> Unit, errorCallback: () -> Unit) {
    val searchUrl = "https://ajax.googleapis.com/ajax/services/search/images?v=1.0&q=${encodeURIComponent(searchTerm)}"
    console.log("calling google image search with $searchUrl")

    val req = TempXMLHttpRequest()
    req.open("GET", searchUrl)
    req.responseType = "json"
    req.onload = {
        console.log("xmlhttprequest.onload ${req.response}")
        val response = req.response
        if (response == null || response.responseData == null || response.responseData.results == null || response.responseData.results.length == 0) {
          errorCallback()
        }
        val firstResult = response.responseData.results[0]
        val imageUrl = firstResult.tbUrl
        val width = firstResult.tbWidth
        val height = firstResult.tbHeight

        successCallback(imageUrl, width, height)
    }
    req.onerror = {
        errorCallback()
    }
    req.send()
}

fun renderStatus(statusText: String) {
    document.getElementById("status").textContent = statusText
}

fun main(args: Array<String>) {
    console.log("Kotlin extension popup script running!")

    document.addEventListener("DOMContentLoaded") {
        chrome.tabs.query(chrome_tabs_CurrentTabQuery()) { tabs ->
            if (tabs.size() == 1 && tabs[0].url != null) {
                val url = tabs[0].url!!
                renderStatus("Performing Google Image search for ${url}")
                getImageUrl(url, {(imageUrl: String, width: Int, height: Int) ->
                    val image = document.getElementById("image-result") as HTMLImageElement;
                    image.width = width.toDouble()
                    image.height = height.toDouble()
                    image.src = url
                    // TODO: why no image.hidden in kotlin dom?
                }, {
                    renderStatus("Cannot display image, failure to talk to Google image search")
                })
            } else {
                renderStatus("No current tab, cannot do anything")
            }
        }
    }

}