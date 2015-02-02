package do.not.use.chrome.ext

/**
 * TODO: This is just for reference, not used because it is generated from a prototype TS => Kotlin generator that doesn't quite get it close to correct
 *       But signatures and field names are mostly right.  But sometimes things need to be classes, sometimes not native at all, etc.
 */
public native object chrome {
    public native object app {
        public native object runtime {
            public native trait LaunchData {
                public var id: String?
                public var items: Array<LaunchDataItem>?
                public var url: String?
                public var referrerUrl: String?
                public var isKioskSession: Boolean?
            }
            public native trait LaunchDataItem {
                public var entry: String
                public var `type`: String
            }
            public native trait LaunchedEvent {
                public fun addListener(callback: (launchData: LaunchData) -> Unit)
            }
            public native trait RestartedEvent {
                public fun addListener(callback: () -> Unit)
            }
            public native var onLaunched: LaunchedEvent = noImpl
            public native var onRestarted: RestartedEvent = noImpl
        }

        public object window {
            public native trait ContentBounds {
                public var left: Number?
                public var top: Number?
                public var width: Number?
                public var height: Number?
            }
            public native trait BoundsSpecification {
                public var left: Number?
                public var top: Number?
                public var width: Number?
                public var height: Number?
                public var minWidth: Number?
                public var minHeight: Number?
                public var maxWidth: Number?
                public var maxHeight: Number?
            }
            public native trait Bounds {
                public var left: Number
                public var top: Number
                public var width: Number
                public var height: Number
                public var minWidth: Number?
                public var minHeight: Number?
                public var maxWidth: Number?
                public var maxHeight: Number?
                public fun setPosition(left: Number, top: Number)
                public fun setSize(width: Number, height: Number)
                public fun setMinimumSize(minWidth: Number, minHeight: Number)
                public fun setMaximumSize(maxWidth: Number, maxHeight: Number)
            }
            public native trait FrameOptions {
                public var `type`: String?
                public var color: String?
                public var activeColor: String?
                public var inactiveColor: String?
            }
            public native trait CreateWindowOptions {
                public var id: String?
                public var innerBounds: BoundsSpecification?
                public var outerBounds: BoundsSpecification?
                public var minWidth: Number?
                public var minHeight: Number?
                public var maxWidth: Number?
                public var maxHeight: Number?
                public var frame: Any?
                public var bounds: ContentBounds?
                public var alphaEnabled: Boolean?
                public var state: String?
                public var hidden: Boolean?
                public var resizable: Boolean?
                public var singleton: Boolean?
                public var alwaysOnTop: Boolean?
                public var focused: Boolean?
                public var visibleOnAllWorkspaces: Boolean?
            }
            public native trait AppWindow {
                public var focus: () -> Unit
                public var fullscreen: () -> Unit
                public var isFullscreen: () -> Boolean
                public var minimize: () -> Unit
                public var isMinimized: () -> Boolean
                public var maximize: () -> Unit
                public var isMaximized: () -> Boolean
                public var restore: () -> Unit
                public var moveTo: (left: Number, top: Number) -> Unit
                public var resizeTo: (width: Number, height: Number) -> Unit
                public var drawAttention: () -> Unit
                public var clearAttention: () -> Unit
                public var close: () -> Unit
                public var show: () -> Unit
                public var hide: () -> Unit
                public var getBounds: () -> ContentBounds
                public var setBounds: (bounds: ContentBounds) -> Unit
                public var isAlwaysOnTop: () -> Boolean
                public var setAlwaysOnTop: (alwaysOnTop: Boolean) -> Unit
                public var setVisibleOnAllWorkspaces: (alwaysVisible: Boolean) -> Unit
                public var contentWindow: window
                public var id: String
                public var innerBounds: Bounds
                public var outerBounds: Bounds
            }
            public native fun create(url: String, options: CreateWindowOptions? = null, callback: ((created_window: AppWindow) -> Unit)? = null): Unit = noImpl
            public native fun current(): AppWindow = noImpl
            public native trait WindowEvent {
                public fun addListener(callback: () -> Unit)
            }
            public native var onBoundsChanged: WindowEvent = noImpl
            public native var onClosed: WindowEvent = noImpl
            public native var onFullscreened: WindowEvent = noImpl
            public native var onMaximized: WindowEvent = noImpl
            public native var onMinimized: WindowEvent = noImpl
            public native var onRestored: WindowEvent = noImpl
        }
    }

    public native object fileSystem {
        public native trait ChildChangeInfo {
            public var entry: Any // TODO: Entry
            public var `type`: String
        }
        public native trait EntryChangedEvent {
            public var target: Any // TODO: Entry
            public var childChanges: Array<ChildChangeInfo>?
        }
        public native trait EntryRemovedEvent {
            public var target: Any // TODO: Entry
        }
        public native trait AcceptOptions {
            public var description: String?
            public var mimeTypes: Array<String>?
            public var extensions: Array<String>?
        }
        public native trait ChooseEntryOptions {
            public var `type`: String?
            public var suggestedName: String?
            public var accepts: Array<AcceptOptions>?
            public var acceptsAllTypes: Boolean?
            public var acceptsMultiple: Boolean?
        }
        public native fun getDisplayPath(entry: Any, callback: (displayPath: String) -> Unit): Unit = noImpl     // TODO: Entry
        public native fun getWritableEntry(entry: Any, callback: (entry: Any) -> Unit): Unit = noImpl            // TODO: Entry
        public native fun isWritableEntry(entry: Any, callback: (isWritable: Boolean) -> Unit): Unit = noImpl    // TODO: Entry
        public native fun chooseEntry(callback: (entry: Any) -> Unit): Unit = noImpl                             // TODO: Entry
        public native fun chooseEntry(callback: (fileEntries: Array<Any>) -> Unit): Unit = noImpl                // TODO: FileEntry
        public native fun chooseEntry(options: ChooseEntryOptions, callback: (entry: Any) -> Unit): Unit = noImpl                 // TODO: Entry
        public native fun chooseEntry(options: ChooseEntryOptions, callback: (fileEntries: Array<Any>) -> Unit): Unit = noImpl    // TODO: FileEntry
        public native fun restoreEntry(id: String, callback: (entry: Any) -> Unit): Unit = noImpl                                 // TODO: Entry
        public native fun isRestorable(id: String, callback: (isRestorable: Boolean) -> Unit): Unit = noImpl
        public native fun retainEntry(entry: Any): String = noImpl                                                                // TODO: Entry
    }

    public native object sockets {
        public native object tcp {
            public native trait CreateInfo {
                public var socketId: Number
            }
            public native trait SendInfo {
                public var resultCode: Number
                public var bytesSent: Number?
            }
            public native trait Event<T> {
                public fun addListener(callback: (info: T) -> Unit)
            }
            public native trait ReceiveEventArgs {
                public var socketId: Number
                public var data: Any // TODO: data: ArrayBuffer
            }
            public native trait ReceiveErrorEventArgs {
                public var socketId: Number
                public var resultCode: Number
            }
            public native trait SocketProperties {
                public var persistent: Boolean?
                public var name: String?
                public var bufferSize: Number?
            }
            public native trait SocketInfo {
                public var socketId: Number
                public var persistent: Boolean
                public var name: String?
                public var bufferSize: Number?
                public var paused: Boolean
                public var connected: Boolean
                public var localAddress: String?
                public var localPort: Number?
                public var peerAddress: String?
                public var peerPort: Number?
            }
            public native fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun setKeepAlive(socketId: Number, enable: Boolean, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun setKeepAlive(socketId: Number, enable: Boolean, delay: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun setNoDelay(socketId: Number, noDelay: Boolean, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun connect(socketId: Number, peerAddress: String, peerPort: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun disconnect(socketId: Number, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun send(socketId: Number, data: Any, callback: (sendInfo: SendInfo) -> Unit): Unit = noImpl     // TODO: data: ArrayBuffer
            public native fun close(socketId: Number, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun getInfo(socketId: Number, callback: (socketInfo: SocketInfo) -> Unit): Unit = noImpl
            public native fun getSockets(socketId: Number, callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = noImpl
            public native var onReceive: Event<ReceiveEventArgs> = noImpl
            public native var onReceiveError: Event<ReceiveErrorEventArgs> = noImpl
        }

        public native object udp {
            public native trait CreateInfo {
                public var socketId: Number
            }
            public native trait SendInfo {
                public var resultCode: Number
                public var bytesSent: Number?
            }
            public native trait Event<T> {
                public fun addListener(callback: (info: T) -> Unit)
            }
            public native trait ReceiveEventArgs {
                public var socketId: Number
                public var data: Any // TODO: data: ArrayBuffer
                public var remoteAddress: String
                public var remotePort: Number
            }
            public native trait ReceiveErrorEventArgs {
                public var socketId: Number
                public var resultCode: Number
            }
            public native trait SocketProperties {
                public var persistent: Boolean?
                public var name: String?
                public var bufferSize: Number?
            }
            public native trait SocketInfo {
                public var socketId: Number
                public var persistent: Boolean
                public var name: String?
                public var bufferSize: Number?
                public var paused: Boolean
                public var localAddress: String?
                public var localPort: Number?
            }
            public native fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun bind(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun send(socketId: Number, data: Any, address: String, port: Number, callback: (sendInfo: SendInfo) -> Unit): Unit = noImpl     // TODO: data: ArrayBuffer
            public native fun close(socketId: Number, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun getInfo(socketId: Number, callback: (socketInfo: SocketInfo) -> Unit): Unit = noImpl
            public native fun getSockets(callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = noImpl
            public native fun joinGroup(socketId: Number, address: String, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun leaveGroup(socketId: Number, address: String, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun setMulticastTimeToLive(socketId: Number, ttl: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun setMulticastLoopbackMode(socketId: Number, enabled: Boolean, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun getJoinedGroups(socketId: Number, callback: (groups: Array<String>) -> Unit): Unit = noImpl
            public native var onReceive: Event<ReceiveEventArgs> = noImpl
            public native var onReceiveError: Event<ReceiveErrorEventArgs> = noImpl
        }

        public native object tcpServer {
            public native trait CreateInfo {
                public var socketId: Number
            }
            public native trait Event<T> {
                public fun addListener(callback: (info: T) -> Unit)
            }
            public native trait AcceptEventArgs {
                public var socketId: Number
                public var clientSocketId: Number
            }
            public native trait AcceptErrorEventArgs {
                public var socketId: Number
                public var resultCode: Number
            }
            public native trait SocketProperties {
                public var persistent: Boolean?
                public var name: String?
            }
            public native trait SocketInfo {
                public var socketId: Number
                public var persistent: Boolean
                public var name: String?
                public var paused: Boolean
                public var localAddress: String?
                public var localPort: Number?
            }
            public native fun create(callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun create(properties: SocketProperties, callback: (createInfo: CreateInfo) -> Unit): Unit = noImpl
            public native fun update(socketId: Number, properties: SocketProperties, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun setPaused(socketId: Number, paused: Boolean, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun listen(socketId: Number, address: String, port: Number, backlog: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun listen(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = noImpl
            public native fun disconnect(socketId: Number, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun close(socketId: Number, callback: (() -> Unit)? = null): Unit = noImpl
            public native fun getInfo(socketId: Number, callback: (socketInfos: Array<SocketInfo>) -> Unit): Unit = noImpl
            public native var onAccept: Event<AcceptEventArgs> = noImpl
            public native var onAcceptError: Event<AcceptErrorEventArgs> = noImpl
        }
    }
    
    public native object alarms {
        public native trait AlarmCreateInfo {
            public var delayInMinutes: Number?
            public var periodInMinutes: Number?
            public var `when`: Number?
        }
        public native trait Alarm {
            public var periodInMinutes: Number?
            public var scheduledTime: Number
            public var name: String
        }
        public native trait AlarmEvent : chrome.events.Event<(alarm: Alarm)->Unit> {
            override fun addListener(callback: (alarm: Alarm) -> Unit)
        }
        public native fun create(alarmInfo: AlarmCreateInfo): Unit = noImpl
        public native fun create(name: String, alarmInfo: AlarmCreateInfo): Unit = noImpl
        public native fun getAll(callback: (alarms: Array<Alarm>) -> Unit): Unit = noImpl
        public native fun clearAll(): Unit = noImpl
        public native fun clear(name: String? = null): Unit = noImpl
        public native fun get(callback: (alarm: Alarm) -> Unit): Unit = noImpl
        public native fun get(name: String, callback: (alarm: Alarm) -> Unit): Unit = noImpl
        public native var onAlarm: AlarmEvent = noImpl
    }
    public native object bookmarks {
        public native trait BookmarkTreeNode {
            public var index: Number?
            public var dateAdded: Number?
            public var title: String
            public var url: String?
            public var dateGroupModified: Number?
            public var id: String
            public var parentId: String?
            public var children: Array<BookmarkTreeNode>?
        }
        public native trait BookmarkRemoveInfo {
            public var index: Number
            public var parentId: String
        }
        public native trait BookmarkMoveInfo {
            public var index: Number
            public var oldIndex: Number
            public var parentId: String
            public var oldParentId: String
        }
        public native trait BookmarkChangeInfo {
            public var url: String?
            public var title: String
        }
        public native trait BookmarkReorderInfo {
            public var childIds: Array<String>
        }
        public native trait BookmarkRemovedEvent : chrome.events.Event<(id: String, removeInfo: BookmarkRemoveInfo) -> Unit> {
            override fun addListener(callback: (id: String, removeInfo: BookmarkRemoveInfo) -> Unit)
        }
        public native trait BookmarkImportEndedEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait BookmarkMovedEvent : chrome.events.Event<(id: String, moveInfo: BookmarkMoveInfo) -> Unit> {
            override fun addListener(callback: (id: String, moveInfo: BookmarkMoveInfo) -> Unit)
        }
        public native trait BookmarkImportBeganEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait BookmarkChangedEvent : chrome.events.Event<(id: String, changeInfo: BookmarkChangeInfo) -> Unit> {
            override fun addListener(callback: (id: String, changeInfo: BookmarkChangeInfo) -> Unit)
        }
        public native trait BookmarkCreatedEvent : chrome.events.Event<(id: String, bookmark: BookmarkTreeNode) -> Unit> {
            override fun addListener(callback: (id: String, bookmark: BookmarkTreeNode) -> Unit)
        }
        public native trait BookmarkChildrenReordered : chrome.events.Event<(id: String, reorderInfo: BookmarkReorderInfo) -> Unit> {
            override fun addListener(callback: (id: String, reorderInfo: BookmarkReorderInfo) -> Unit)
        }
        public native var MAX_WRITE_OPERATIONS_PER_HOUR: Number = noImpl
        public native var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number = noImpl
        public native fun search(query: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun getTree(callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun getRecent(numberOfItems: Number, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun get(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun get(idList: Array<String>, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun create(bookmark: Any, callback: ((result: BookmarkTreeNode) -> Unit)? = null): Unit = noImpl    // TODO: bookmark: Object
        public native fun move(id: String, destination: Any, callback: ((result: BookmarkTreeNode) -> Unit)? = null): Unit = noImpl   // TODO: destination: Object
        public native fun update(id: String, changes: Any, callback: ((result: BookmarkTreeNode) -> Unit)? = null): Unit = noImpl     // TODO: changes: Object
        public native fun remove(id: String, callback: ((id: String, removeInfo: BookmarkRemoveInfo) -> Unit)? = null): Unit = noImpl
        public native fun getChildren(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun getSubTree(id: String, callback: (results: Array<BookmarkTreeNode>) -> Unit): Unit = noImpl
        public native fun removeTree(id: String, callback: (()->Unit)? = null): Unit = noImpl   // TODO: callback: Function, what callback is it really?
        public native var onRemoved: BookmarkRemovedEvent = noImpl
        public native var onImportEnded: BookmarkImportEndedEvent = noImpl
        public native var onImportBegan: BookmarkImportBeganEvent = noImpl
        public native var onChanged: BookmarkChangedEvent = noImpl
        public native var onCreated: BookmarkCreatedEvent = noImpl
        public native var onChildrenReordered: BookmarkChildrenReordered = noImpl
    }
 
    public native object browserAction {
        public native trait BadgeBackgroundColorDetails {
            public var color: Any
            public var tabId: Number? 
        }
        public native trait BadgeTextDetails {
            public var text: String
            public var tabId: Number?
        }
        public native trait TitleDetails {
            public var title: String
            public var tabId: Number?
        }
        public native trait TabDetails {
            public var tabId: Number? 
        }
        public native trait TabIconDetails {
            public var path: Any? 
            public var tabId: Number?
            public var imageData: Any? // TODO: imageData: ImageData 
        }
        public native trait PopupDetails {
            public var tabId: Number?
            public var popup: String
        }
        public native trait BrowserClickedEvent : chrome.events.Event<(tab: chrome.tabs.Tab) -> Unit> {
            override fun addListener(callback: (tab: chrome.tabs.Tab) -> Unit)
        }
        public native fun enable(tabId: Number? = null): Unit = noImpl
        public native fun setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = noImpl
        public native fun setBadgeText(details: BadgeTextDetails): Unit = noImpl
        public native fun setTitle(details: TitleDetails): Unit = noImpl
        public native fun getBadgeText(details: TabDetails, callback: (result: String) -> Unit): Unit = noImpl
        public native fun setPopup(details: PopupDetails): Unit = noImpl
        public native fun disable(tabId: Number? = null): Unit = noImpl
        public native fun getTitle(details: TabDetails, callback: (result: String) -> Unit): Unit = noImpl
        public native fun getBadgeBackgroundColor(details: TabDetails, callback: (result: Array<Number>) -> Unit): Unit = noImpl
        public native fun getPopup(details: TabDetails, callback: (result: String) -> Unit): Unit = noImpl
        public native fun setIcon(details: TabIconDetails, callback: (()->Unit)? = null): Unit = noImpl     // TODO: callback: Function, what callback is it really?
        public native var onClicked: BrowserClickedEvent = noImpl
    }
    
    public native object browsingData {
        public native trait OriginTypes {
            public var protectedWeb: Boolean?
            public var extension: Boolean?
            public var unprotectedWeb: Boolean? 
        }
        public native trait RemovalOptions {
            public var originTypes: OriginTypes?
            public var since: Number? 
        }
        public native trait DataToRemove {
            public var webSQL: Boolean? 
            public var indexedDB: Boolean? 
            public var cookies: Boolean?
            public var passwords: Boolean? 
            public var serverBoundCertificates: Boolean? 
            public var downloads: Boolean?
            public var cache: Boolean? 
            public var appcache: Boolean? 
            public var fileSystems: Boolean? 
            public var pluginData: Boolean? 
            public var localStorage: Boolean? 
            public var formData: Boolean? 
            public var history: Boolean?
        }
        // TODO: all of these functions have callbacks with unknown parameters
        public native fun removePluginData(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeFormData(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeFileSystems(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun remove(options: RemovalOptions, dataToRemove: DataToRemove, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removePasswords(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeCookies(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeWebSQL(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeAppcache(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeDownloads(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeLocalStorage(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeCache(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeHistory(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native fun removeIndexedDB(options: RemovalOptions, callback: (()->Unit)? = null): Unit = noImpl
    }
    
    public native object commands {
        public native trait CommandEvent : chrome.events.Event<(command: String) -> Unit> {
            override fun addListener(callback: (command: String) -> Unit)
        }
        public var onCommand: CommandEvent = noImpl
    }
    
    public native object contentSettings {
        public native trait ClearDetails {
            public var scope: String? 
        }
        public native trait SetDetails {
            public var resourceIdentifier: ResourceIdentifier? 
            public var setting: Any
            public var secondaryPattern: String? 
            public var scope: String?
            public var primaryPattern: String
        }
        public native trait GetDetails {
            public var secondaryUrl: String?
            public var resourceIdentifier: ResourceIdentifier? 
            public var incognito: Boolean?
            public var primaryUrl: String
        }
        public native trait ReturnedDetails {
            public var setting: Any
        }
        public native trait ContentSetting {
            // TODO: all of these functions have callbacks with unknown parameters
            public fun clear(details: ClearDetails, callback: (()->Unit)? = null)
            public fun set(details: SetDetails, callback: (()->Unit)? = null)
            public fun getResourceIdentifiers(callback: (resourceIdentifiers: Array<ResourceIdentifier>) -> Unit)
            public fun get(details: GetDetails, callback: (details: ReturnedDetails) -> Unit)
        }
        public native trait ResourceIdentifier {
            public var id: String
            public var description: String? 
        }
        public native var cookies: ContentSetting = noImpl
        public native var popups: ContentSetting = noImpl
        public native var javascript: ContentSetting = noImpl
        public native var notifications: ContentSetting = noImpl
        public native var plugins: ContentSetting = noImpl
        public native var images: ContentSetting = noImpl
    }
    
    public native object contextMenus {
        public native trait OnClickData {
            public var selectionText: String?
            public var checked: Boolean?
            public var menuItemId: Any
            public var frameUrl: String?
            public var editable: Boolean
            public var mediaType: String?
            public var wasChecked: Boolean?
            public var pageUrl: String
            public var linkUrl: String?
            public var parentMenuItemId: Any?
            public var srcUrl: String?
        }
        public native trait CreateProperties {
            public var documentUrlPatterns: Array<String>?
            public var checked: Boolean?
            public var title: String?
            public var contexts: Array<String>?
            public var enabled: Boolean?
            public var targetUrlPatterns: Array<String>?
            public var onclick: ((info: OnClickData, tab: chrome.tabs.Tab) -> Unit)?
            public var parentId: Any?
            public var `type`: String?
            public var id: String?
        }
        public native trait UpdateProperties {
            public var documentUrlPatterns: Array<String>?
            public var checked: Boolean?
            public var title: String?
            public var contexts: Array<String>?
            public var enabled: Boolean?
            public var targetUrlPatterns: Array<String>?
            public var onclick: (()->Unit)?        // TODO: what is the function prototype?  this isn't likely correct
            public var parentId: Any?
            public var `type`: String?
        }
        public native trait MenuClickedEvent : chrome.events.Event<(info: OnClickData, tab: chrome.tabs.Tab? = null) -> Unit> {
            override fun addListener(callback: (info: OnClickData, tab: chrome.tabs.Tab? = null) -> Unit)
        }
        // TODO: all of these functions have callbacks with unknown parameters
        public native fun removeAll(callback: (()->Unit)? = null): Unit = noImpl
        public native fun create(createProperties: CreateProperties, callback: (()->Unit)? = null): Unit = noImpl
        public native fun update(id: Any, updateProperties: UpdateProperties, callback: (()->Unit)? = null): Unit = noImpl
        public native fun remove(menuItemId: Any, callback: (()->Unit)? = null): Unit = noImpl
        public native var onClicked: MenuClickedEvent = noImpl
    }

    public native object cookies {
        public native trait Cookie {
            public var domain: String
            public var name: String
            public var storeId: String
            public var value: String
            public var session: Boolean
            public var hostOnly: Boolean
            public var expirationDate: Number?
            public var path: String
            public var httpOnly: Boolean
            public var secure: Boolean
        }
        public native trait CookieStore {
            public var id: String
            public var tabIds: Array<Number>
        }
        public native trait GetAllDetails {
            public var domain: String?
            public var name: String?
            public var url: String?
            public var storeId: String?
            public var session: Boolean?
            public var path: String?
            public var secure: Boolean?
        }
        public native trait SetDetails {
            public var domain: String?
            public var name: String?
            public var url: String
            public var storeId: String?
            public var value: String?
            public var expirationDate: Number?
            public var path: String?
            public var httpOnly: Boolean?
            public var secure: Boolean?
        }
        public native trait Details {
            public var name: String
            public var url: String
            public var storeId: String?
        }
        public native trait CookieChangeInfo {
            public var cookie: Cookie
            public var removed: Boolean
            public var cause: String
        }
        public native trait CookieChangedEvent : chrome.events.Event<(changeInfo: CookieChangeInfo) -> Unit> {
            override fun addListener(callback: (changeInfo: CookieChangeInfo) -> Unit)
        }
        public native fun getAllCookieStores(callback: (cookieStores: Array<CookieStore>) -> Unit): Unit = noImpl
        public native fun getAll(details: GetAllDetails, callback: (cookies: Cookie) -> Unit): Unit = noImpl
        public native fun set(details: SetDetails, callback: ((cookie: Cookie? = null) -> Unit)? = null): Unit = noImpl
        public native fun remove(details: Details, callback: ((details: Details) -> Unit)? = null): Unit = noImpl
        public native fun get(details: Details, callback: (cookie: Cookie? = null) -> Unit): Unit = noImpl
        public native var onChanged: CookieChangedEvent = noImpl
    }

    public native object declarativeWebRequest {
        public native trait HeaderFilter {
            public var nameEquals: String?
            public var valueContains: Any?
            public var nameSuffix: String?
            public var valueSuffix: String?
            public var valuePrefix: String?
            public var nameContains: Any?
            public var valueEquals: String?
            public var namePrefix: String?
        }
        public native trait AddResponseHeader {
            public var name: String
            public var value: String
        }
        public native trait RemoveResponseCookie {
            public var filter: ResponseCookie
        }
        public native trait RemoveResponseHeader {
            public var name: String
            public var value: String?
        }
        public native trait RequestMatcher {
            public var contentType: Array<String>?
            public var url: chrome.events.UrlFilter?
            public var excludeContentType: Array<String>?
            public var excludeResponseHeader: Array<HeaderFilter>?
            public var resourceType: String?
            public var responseHeaders: Array<HeaderFilter>?
        }
        public native trait IgnoreRules {
            public var lowerPriorityThan: Number
        }
        public native trait RedirectToEmptyDocument
        public native trait RedirectRequest {
            public var redirectUrl: String
        }
        public native trait ResponseCookie {
            public var domain: String?
            public var name: String?
            public var expires: String?
            public var maxAge: Number?
            public var value: String?
            public var path: String?
            public var httpOnly: String?
            public var secure: String?
        }
        public native trait AddResponseCookie {
            public var cookie: ResponseCookie
        }
        public native trait EditResponseCookie {
            public var filter: ResponseCookie
            public var modification: ResponseCookie
        }
        public native trait CancelRequest
        public native trait RemoveRequestHeader {
            public var name: String
        }
        public native trait EditRequestCookie {
            public var filter: RequestCookie
            public var modification: RequestCookie
        }
        public native trait SetRequestHeader {
            public var name: String
            public var value: String
        }
        public native trait RequestCookie {
            public var name: String?
            public var value: String?
        }
        public native trait RedirectByRegEx {
            public var to: String
            public var from: String
        }
        public native trait RedirectToTransparentImage
        public native trait AddRequestCookie {
            public var cookie: RequestCookie
        }
        public native trait RemoveRequestCookie {
            public var filter: RequestCookie
        }
        public native trait RequestedEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native var onRequest: RequestedEvent = noImpl
    }

    public native object desktopCapture {
        public native fun chooseDesktopMedia(sources: Array<String>, targetTab: chrome.tabs.Tab? = null, callback: ((streamId: String) -> Unit)? = null): Unit = noImpl
        public native fun cancelChooseDesktopMedia(desktopMediaRequestId: Number): Unit = noImpl
    }

    /*
    public native object devtools {

        public native object inspectedWindow {
            public trait Resource {
                public var url: String
                public fun getContent(callback: (content: String, encoding: String) -> Unit)
                public fun setContent(content: String, commit: Boolean, callback: ((error: Object) -> Unit)? = null)
            }
            public trait ReloadOptions {
                public var userAgent: String?
                public var ignoreCache: Boolean?
                public var injectedScript: Boolean?
            }
            public trait ResourceAddedEvent : chrome.events.Event {
                override fun addListener(callback: (resource: Resource) -> Unit)
            }
            public trait ResourceContentCommittedEvent : chrome.events.Event {
                override fun addListener(callback: (resource: Resource, content: String) -> Unit)
            }
            public var tabId: Number = noImpl
            public fun reload(reloadOptions: ReloadOptions): Unit = noImpl
            public fun eval(expression: String, callback: ((result: Object, isException: Boolean) -> Unit)? = null): Unit = noImpl
            public fun getResources(callback: (resources: Array<Resource>) -> Unit): Unit = noImpl
            public var onResourceAdded: ResourceAddedEvent = noImpl
            public var onResourceContentCommitted: ResourceContentCommittedEvent = noImpl
        }
        module
        public object network {
            public trait Request {
                public fun getContent(callback: (content: String, encoding: String) -> Unit)
            }
            public trait RequestFinishedEvent : chrome.events.Event {
                override fun addListener(callback: (request: Request) -> Unit)
            }
            public trait NavigatedEvent : chrome.events.Event {
                override fun addListener(callback: (url: String) -> Unit)
            }
            public fun getHAR(callback: (harLog: Object) -> Unit): Unit = noImpl
            public var onRequestFinished: RequestFinishedEvent = noImpl
            public var onNavigated: NavigatedEvent = noImpl
        }
        module
        public object panels {
            public trait PanelShownEvent : chrome.events.Event {
                override fun addListener(callback: (window: chrome.windows.Window) -> Unit)
            }
            public trait PanelHiddenEvent : chrome.events.Event {
                override fun addListener(callback: Function)
            }
            public trait PanelSearchEvent : chrome.events.Event {
                override fun addListener(callback: (action: String, queryString: String? = null) -> Unit)
            }
            public trait ExtensionPanel {
                public fun createStatusButton(iconPath: String, tooltipText: String, disabled: Boolean): Button
                public var onShown: PanelShownEvent
                public var onHidden: PanelHiddenEvent
                public var onSearch: PanelSearchEvent
            }
            public trait ButtonClickedEvent : chrome.events.Event {
                override fun addListener(callback: Function)
            }
            public trait Button {
                public fun update(iconPath: String? = null, tooltipText: String? = null, disabled: Boolean? = null)
                public var onClicked: ButtonClickedEvent
            }
            public trait SelectionChangedEvent : chrome.events.Event {
                override fun addListener(callback: Function)
            }
            public trait ElementsPanel {
                public fun createSidebarPane(title: String, callback: ((result: ExtensionSidebarPane) -> Unit)? = null)
                public var onSelectionChanged: SelectionChangedEvent
            }
            public trait ExtensionSidebarPaneShownEvent : chrome.events.Event {
                override fun addListener(callback: (window: chrome.windows.Window) -> Unit)
            }
            public trait ExtensionSidebarPaneHiddenEvent : chrome.events.Event {
                override fun addListener(callback: Function)
            }
            public trait ExtensionSidebarPane {
                public fun setHeight(height: String)
                public fun setExpression(expression: String, rootTitle: String? = null, callback: Function? = null)
                public fun setObject(jsonObject: String, rootTitle: String? = null, callback: Function? = null)
                public fun setPage(path: String)
                public var onShown: ExtensionSidebarPaneShownEvent
                public var onHidden: ExtensionSidebarPaneHiddenEvent
            }
            public var elements: ElementsPanel = noImpl
            public fun create(title: String, iconPath: String, pagePath: String, callback: ((panel: ExtensionPanel) -> Unit)? = null): Unit = noImpl
            public fun setOpenResourceHandler(callback: (resource: chrome.devtools.inspectedWindow.Resource) -> Unit): Unit = noImpl
        }
    }
    */

    public native object downloads {
        public native trait HeaderNameValuePair {
            public var name: String
            public var value: String
        }
        public native trait DownloadOptions {
            public var body: String?
            public var saveAs: Boolean?
            public var url: String
            public var filename: String?
            public var headers: Array<HeaderNameValuePair>?
            public var method: String?
        }
        public native trait DownloadDelta {
            public var danger: DownloadStringDiff?
            public var url: DownloadStringDiff?
            public var totalBytes: DownloadStringDiff?
            public var dangerAccepted: DownloadBooleanDiff?
            public var filename: DownloadStringDiff?
            public var paused: DownloadBooleanDiff?
            public var state: DownloadStringDiff?
            public var mime: DownloadStringDiff?
            public var fileSize: DownloadLongDiff?
            public var startTime: DownloadLongDiff?
            public var error: DownloadLongDiff?
            public var endTime: DownloadLongDiff?
            public var id: Number
        }
        public native trait DownloadBooleanDiff {
            public var current: Boolean?
            public var previous: Boolean?
        }
        public native trait DownloadLongDiff {
            public var current: Number?
            public var previous: Number?
        }
        public native trait DownloadStringDiff {
            public var current: String?
            public var previous: String?
        }
        public native trait DownloadItem {
            public var bytesReceived: Number
            public var danger: String
            public var url: String
            public var totalBytes: Number
            public var dangerAccepted: Boolean?
            public var filename: String
            public var paused: Boolean
            public var state: String
            public var mime: String
            public var fileSize: Number
            public var startTime: Number
            public var error: Number?
            public var endTime: Number?
            public var id: Number
            public var incognito: Boolean
        }
        public native trait GetFileIconOptions {
            public var size: Number?
        }
        public native trait DownloadQuery {
            public var orderBy: String?
            public var urlRegex: String?
            public var endedBefore: Number?
            public var totalBytesGreater: Number?
            public var danger: String?
            public var totalBytes: Number?
            public var paused: Boolean?
            public var filenameRegex: String?
            public var query: String?
            public var totalBytesLess: Number?
            public var id: Number?
            public var bytesReceived: Number?
            public var endedAfter: Number?
            public var filename: String?
            public var state: String?
            public var startedAfter: Number?
            public var dangerAccepted: Boolean?
            public var mime: String?
            public var fileSize: Number?
            public var startTime: Number?
            public var url: String?
            public var startedBefore: Number?
            public var limit: Number?
            public var error: Number?
            public var endTime: Number?
        }
        public native trait DownloadChangedEvent : chrome.events.Event<(downloadDelta: DownloadDelta) -> Unit> {
            override fun addListener(callback: (downloadDelta: DownloadDelta) -> Unit)
        }
        public native trait DownloadCreatedEvent : chrome.events.Event<(downloadItem: DownloadItem) -> Unit> {
            override fun addListener(callback: (downloadItem: DownloadItem) -> Unit)
        }
        public native trait DownloadErasedEvent : chrome.events.Event<(downloadId: Number) -> Unit> {
            override fun addListener(callback: (downloadId: Number) -> Unit)
        }

        // TODO: check callback method signatures below

        public native fun search(query: DownloadQuery, callback: (results: Array<DownloadItem>) -> Unit): Unit = noImpl
        public native fun pause(downloadId: Number, callback: (()->Unit)? = null): Unit = noImpl
        public native fun getFileIcon(downloadId: Number, callback: (iconURL: String) -> Unit): Unit = noImpl
        public native fun getFileIcon(downloadId: Number, options: GetFileIconOptions, callback: (iconURL: String) -> Unit): Unit = noImpl
        public native fun resume(downloadId: Number, callback: (()->Unit)? = null): Unit = noImpl
        public native fun cancel(downloadId: Number, callback: (()->Unit)? = null): Unit = noImpl
        public native fun download(options: DownloadOptions, callback: ((downloadId: Number) -> Unit)? = null): Unit = noImpl
        public native fun open(downloadId: Number): Unit = noImpl
        public native fun show(downloadId: Number): Unit = noImpl
        public native fun showDefaultFolder(): Unit = noImpl
        public native fun erase(query: DownloadQuery, callback: (results: Array<DownloadItem>) -> Unit): Unit = noImpl
        public native fun removeFile(downloadId: Number, callback: () -> Unit): Unit = noImpl
        public native fun acceptDanger(downloadId: Number, callback: () -> Unit): Unit = noImpl
        public native fun drag(downloadId: Number): Unit = noImpl
        public native fun setShelfEnabled(enabled: Boolean): Unit = noImpl
        public native var onChanged: DownloadChangedEvent = noImpl
        public native var onCreated: DownloadCreatedEvent = noImpl
        public native var onErased: DownloadErasedEvent = noImpl
    }

    public native object events {
        public native trait UrlFilter {
            public var schemes: Array<String>?
            public var urlMatches: String?
            public var pathContains: String?
            public var hostSuffix: String?
            public var hostPrefix: String?
            public var hostContains: String?
            public var urlContains: String?
            public var querySuffix: String?
            public var urlPrefix: String?
            public var hostEquals: String?
            public var urlEquals: String?
            public var queryContains: String?
            public var pathPrefix: String?
            public var pathEquals: String?
            public var pathSuffix: String?
            public var queryEquals: String?
            public var queryPrefix: String?
            public var urlSuffix: String?
            public var ports: Array<Any>?
        }
        public native trait Event<T> {
            public fun addListener(callback: T)
            public fun addListener(callback: T, filter:Any? = null, extraInfoSpec:Array<String>? = null)
            public fun getRules(callback: (rules: Array<Rule>) -> Unit)
            public fun getRules(ruleIdentifiers: Array<String>, callback: (rules: Array<Rule>) -> Unit)
            public fun hasListener(callback: T)
            public fun removeRules(ruleIdentifiers: Array<String>? = null, callback: T? = null)
            public fun addRules(rules: Array<Rule>, callback: ((rules: Array<Rule>) -> Unit)? = null)
            public fun removeListener(callback: T)
            public fun hasListeners(): Boolean
        }
        public native trait Rule {
            public var priority: Number?
            public var conditions: Array<Any>
            public var id: String?
            public var actions: Array<Any>
        }
    }

    public native object extension {
        public native trait FetchProperties {
            public var windowId: Number?
            public var `type`: String?
        }
        public native trait LastError {
            public var message: String?
        }
        public native var inIncognitoContext: Boolean = noImpl
        public native var lastError: LastError = noImpl
        public native fun getBackgroundPage(): chrome.ext.chrome.app.window = noImpl
        public native fun getURL(path: String): String = noImpl
        public native fun setUpdateUrlData(data: String): Unit = noImpl
        public native fun getViews(fetchProperties: FetchProperties? = null): Array<chrome.ext.chrome.app.window> = noImpl
        public native fun isAllowedFileSchemeAccess(callback: (isAllowedAccess: Boolean) -> Unit): Unit = noImpl
        public native fun isAllowedIncognitoAccess(callback: (isAllowedAccess: Boolean) -> Unit): Unit = noImpl
    }

    /*
    public object fileBrowserHandler {
        public trait SelectionParams {
            public var allowedFileExtensions: Array<String>?
            public var suggestedName: String
        }
        public trait SelectionResult {
            public var entry: Object?
            public var success: Boolean
        }
        public trait FileHandlerExecuteEventDetails {
            public var tab_id: Number?
            public var entries: Array<Any>
            public fun selectFile(selectionParams: SelectionParams, callback: (result: SelectionResult) -> Unit)
        }
        public trait FileBrowserHandlerExecuteEvent : chrome.events.Event {
            override fun addListener(callback: (id: String, details: FileHandlerExecuteEventDetails) -> Unit)
        }
        public var onExecute: FileBrowserHandlerExecuteEvent = noImpl
    }
    module
    public object fontSettings {
        public trait FontName {
            public var displayName: String
            public var fontId: String
        }
        public trait DefaultFontSizeDetails {
            public var pixelSize: Number
        }
        public trait FontDetails {
            public var genericFamily: String
            public var script: String?
        }
        public trait FullFontDetails {
            public var genericFamily: String
            public var levelOfControl: String
            public var script: String?
            public var fontId: String
        }
        public trait FontDetailsResult {
            public var levelOfControl: String
            public var fontId: String
        }
        public trait FontSizeDetails {
            public var pixelSize: Number
            public var levelOfControl: String
        }
        public trait SetFontSizeDetails {
            public var pixelSize: Number
        }
        public trait SetFontDetails {
            public var genericFamily: String
            public var script: String?
            public var fontId: String
        }
        public trait DefaultFixedFontSizeChangedEvent : chrome.events.Event {
            override fun addListener(callback: (details: FontSizeDetails) -> Unit)
        }
        public trait DefaultFontSizeChangedEvent : chrome.events.Event {
            override fun addListener(callback: (details: FontSizeDetails) -> Unit)
        }
        public trait MinimumFontSizeChangedEvent : chrome.events.Event {
            override fun addListener(callback: (details: FontSizeDetails) -> Unit)
        }
        public trait FontChangedEvent : chrome.events.Event {
            override fun addListener(callback: (details: FullFontDetails) -> Unit)
        }
        public fun setDefaultFontSize(details: DefaultFontSizeDetails, callback: Function? = null): Unit = noImpl
        public fun getFont(details: FontDetails, callback: ((details: FontDetailsResult) -> Unit)? = null): Unit = noImpl
        public fun getDefaultFontSize(details: FontSizeDetails? = null, callback: ((options: FontSizeDetails) -> Unit)? = null): Unit = noImpl
        public fun getMinimumFontSize(details: FontSizeDetails? = null, callback: ((options: FontSizeDetails) -> Unit)? = null): Unit = noImpl
        public fun setMinimumFontSize(details: SetFontSizeDetails, callback: Function? = null): Unit = noImpl
        public fun getDefaultFixedFontSize(details: Object? = null, callback: ((details: FontSizeDetails) -> Unit)? = null): Unit = noImpl
        public fun clearDefaultFontSize(details: Object? = null, callback: Function? = null): Unit = noImpl
        public fun setDefaultFixedFontSize(details: SetFontSizeDetails, callback: Function? = null): Unit = noImpl
        public fun clearFont(details: FontDetails, callback: Function? = null): Unit = noImpl
        public fun setFont(details: SetFontDetails, callback: Function? = null): Unit = noImpl
        public fun clearMinimumFontSize(details: Object? = null, callback: Function? = null): Unit = noImpl
        public fun getFontList(callback: (results: Array<FontName>) -> Unit): Unit = noImpl
        public fun clearDefaultFixedFontSize(details: Object, callback: Function? = null): Unit = noImpl
        public var onDefaultFixedFontSizeChanged: DefaultFixedFontSizeChangedEvent = noImpl
        public var onDefaultFontSizeChanged: DefaultFontSizeChangedEvent = noImpl
        public var onMinimumFontSizeChanged: MinimumFontSizeChangedEvent = noImpl
        public var onFontChanged: FontChangedEvent = noImpl
    }
    */

    public native object history {
        public native trait VisitItem {
            public var transition: String
            public var visitTime: Number?
            public var visitId: String
            public var referringVisitId: String
            public var id: String
        }
        public native trait HistoryItem {
            public var typedCount: Number?
            public var title: String?
            public var url: String?
            public var lastVisitTime: Number?
            public var visitCount: Number?
            public var id: String
        }
        public native trait HistoryQuery {
            public var text: String
            public var maxResults: Number?
            public var startTime: Number?
            public var endTime: Number?
        }
        public native trait Url {
            public var url: String
        }
        public native trait Range {
            public var endTime: Number
            public var startTime: Number
        }
        public native trait RemovedResult {
            public var allHistory: Boolean
            public var urls: Array<String>?
        }
        public native trait HistoryVisitedEvent : chrome.events.Event<(result: HistoryItem) -> Unit> {
            override fun addListener(callback: (result: HistoryItem) -> Unit)
        }
        public native trait HistoryVisitRemovedEvent : chrome.events.Event<(removed: RemovedResult) -> Unit> {
            override fun addListener(callback: (removed: RemovedResult) -> Unit)
        }

        // TODO: check event callback signatures, some are likely wrong

        public native fun search(query: HistoryQuery, callback: (results: Array<HistoryItem>) -> Unit): Unit = noImpl
        public native fun addUrl(details: Url, callback: (()->Unit)? = null): Unit = noImpl
        public native fun deleteRange(range: Range, callback: (()->Unit)): Unit = noImpl
        public native fun deleteAll(callback: (()->Unit)): Unit = noImpl
        public native fun getVisits(details: Url, callback: (results: Array<VisitItem>) -> Unit): Unit = noImpl
        public native fun deleteUrl(details: Url, callback: (()->Unit)? = null): Unit = noImpl
        public native var onVisited: HistoryVisitedEvent = noImpl
        public native var onVisitRemoved: HistoryVisitRemovedEvent = noImpl
    }

    public native object identity {
        public var getAuthToken: (options: Any, cb: (token: Any) -> Unit) -> Unit = noImpl
    }

    public native object i18n {
        public fun getMessage(messageName: String, substitutions: Any? = null): String = noImpl
        public fun getAcceptLanguages(callback: (languages: Array<String>) -> Unit): Unit = noImpl
        public fun getUILanguage(): String = noImpl
    }

    public native object idle {
        public trait IdleStateChangedEvent : chrome.events.Event<(newState: String) -> Unit> {
            override fun addListener(callback: (newState: String) -> Unit)
        }
        public native fun queryState(thresholdSeconds: Number, callback: (newState: String) -> Unit): Unit = noImpl
        public native var onStateChanged: IdleStateChangedEvent = noImpl
    }

    public native object input {

        public native object ime {
            public native trait KeyboardEvent {
                public var shiftKey: Boolean?
                public var altKey: Boolean?
                public var requestId: String
                public var key: String
                public var ctrlKey: Boolean?
                public var `type`: String
            }
            public native trait InputContext {
                public var contextID: Number
                public var `type`: String
            }
            public native trait ImeParameters {
                public var items: Array<Any>
                public var engineID: String
            }
            public native trait CommitTextParameters {
                public var text: String
                public var contextID: Number
            }
            public native trait CandidatesParameters {
                public var contextID: Number
                public var candidates: Array<Any>
            }
            public native trait CompositionParameters {
                public var contextID: Number
                public var text: String
                public var segments: Array<Any>
                public var cursor: Number
                public var selectionStart: Number?
                public var selectionEnd: Number?
            }
            public native trait MenuItemParameters {
                public var items: Array<Any>
                public var engineId: String
            }
            public native trait CandidateWindowPropertiesParameters {
                public var cursorVisible: Boolean?
                public var vertical: Boolean?
                public var pageSize: Number?
                public var auxiliaryTextVisible: Boolean?
                public var auxiliaryText: String?
                public var visible: Boolean?
            }
            public native trait ClearCompositionParameters {
                public var contextID: Number
            }
            public native trait CursorPositionParameters {
                public var candidateID: Number
                public var contextID: Number
            }
            public native trait BlurEvent : chrome.events.Event<(contextID: Number) -> Unit> {
                override fun addListener(callback: (contextID: Number) -> Unit)
            }
            public native trait CandidateClickedEvent : chrome.events.Event<(engineID: String, candidateID: Number, button: String) -> Unit> {
                override fun addListener(callback: (engineID: String, candidateID: Number, button: String) -> Unit)
            }
            public native trait KeyEventEvent : chrome.events.Event< (engineID: String, keyData: KeyboardEvent) -> Unit> {
                override fun addListener(callback: (engineID: String, keyData: KeyboardEvent) -> Unit)
            }
            public native trait DeactivatedEvent : chrome.events.Event<(engineID: String) -> Unit> {
                override fun addListener(callback: (engineID: String) -> Unit)
            }
            public native trait InputContextUpdateEvent : chrome.events.Event<(context: InputContext) -> Unit> {
                override fun addListener(callback: (context: InputContext) -> Unit)
            }
            public native trait ActivateEvent : chrome.events.Event<(engineID: String) -> Unit> {
                override fun addListener(callback: (engineID: String) -> Unit)
            }
            public native trait FocusEvent : chrome.events.Event<(context: InputContext) -> Unit> {
                override fun addListener(callback: (context: InputContext) -> Unit)
            }
            public native trait MenuItemActivatedEvent : chrome.events.Event<(engineID: String, name: String) -> Unit> {
                override fun addListener(callback: (engineID: String, name: String) -> Unit)
            }

            // TODO: check parameters of event callbacks, likely not all correct
            public native fun setMenuItems(parameters: ImeParameters, callback: (()->Unit)? = null): Unit = noImpl
            public native fun commitText(parameters: CommitTextParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native fun setCandidates(parameters: CandidatesParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native fun setComposition(parameters: CompositionParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native fun updateMenuItems(parameters: MenuItemParameters, callback: (()->Unit)? = null): Unit = noImpl
            public native fun setCandidateWindowProperties(parameters: CandidateWindowPropertiesParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native fun clearComposition(parameters: ClearCompositionParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native fun setCursorPosition(parameters: CursorPositionParameters, callback: ((success: Boolean) -> Unit)? = null): Unit = noImpl
            public native var onBlur: BlurEvent = noImpl
            public native var onCandidateClicked: CandidateClickedEvent = noImpl
            public native var onKeyEvent: KeyEventEvent = noImpl
            public native var onDeactivated: DeactivatedEvent = noImpl
            public native var onInputContextUpdate: InputContextUpdateEvent = noImpl
            public native var onActivate: ActivateEvent = noImpl
            public native var onFocus: FocusEvent = noImpl
            public native var onMenuItemActivated: MenuItemActivatedEvent = noImpl
        }
    }

    public native object management {
        public native trait ExtensionInfo {
            public var disabledReason: String?
            public var appLaunchUrl: String?
            public var description: String
            public var permissions: Array<String>
            public var icons: Array<IconInfo>?
            public var hostPermissions: Array<String>
            public var enabled: Boolean
            public var homepageUrl: String?
            public var mayDisable: Boolean
            public var installType: String
            public var version: String
            public var id: String
            public var offlineEnabled: Boolean
            public var updateUrl: String?
            public var `type`: String
            public var optionsUrl: String
            public var name: String
        }
        public native trait IconInfo {
            public var url: String
            public var size: Number
        }
        public native trait UninstallOptions {
            public var showConfirmDialog: Boolean?
        }
        public native trait ManagementDisabledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit> {
            override fun addListener(callback: (info: ExtensionInfo) -> Unit)
        }
        public native trait ManagementUninstalledEvent : chrome.events.Event<(id: String) -> Unit> {
            override fun addListener(callback: (id: String) -> Unit)
        }
        public native trait ManagementInstalledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit> {
            override fun addListener(callback: (info: ExtensionInfo) -> Unit)
        }
        public native trait ManagementEnabledEvent : chrome.events.Event<(info: ExtensionInfo) -> Unit> {
            override fun addListener(callback: (info: ExtensionInfo) -> Unit)
        }

        // TODO: check parameters of event callbacks, likely not all correct
        public native fun setEnabled(id: String, enabled: Boolean, callback: (()->Unit)? = null): Unit = noImpl
        public native fun getPermissionWarningsById(id: String, callback: ((permissionWarnings: Array<String>) -> Unit)? = null): Unit = noImpl
        public native fun get(id: String, callback: ((result: ExtensionInfo) -> Unit)? = null): Unit = noImpl
        public native fun getAll(callback: ((result: Array<ExtensionInfo>) -> Unit)? = null): Unit = noImpl
        public native fun getPermissionWarningsByManifest(manifestStr: String, callback: ((permissionwarnings: Array<String>) -> Unit)? = null): Unit = noImpl
        public native fun launchApp(id: String, callback: (()->Unit)? = null): Unit = noImpl
        public native fun uninstall(id: String, options: UninstallOptions, callback: (()->Unit)? = null): Unit = noImpl
        public native var onDisabled: ManagementDisabledEvent = noImpl
        public native var onUninstalled: ManagementUninstalledEvent = noImpl
        public native var onInstalled: ManagementInstalledEvent = noImpl
        public native var onEnabled: ManagementEnabledEvent = noImpl
    }

    public native object notifications {
        public native trait ButtonOptions {
            public var title: String
            public var iconUrl: String?
        }
        public native trait ItemOptions {
            public var title: String
            public var message: String
        }
        public native trait NotificationOptions {
            public var `type`: String?
            public var iconUrl: String?
            public var title: String?
            public var message: String?
            public var contextMessage: String?
            public var priority: Number?
            public var eventTime: Number?
            public var buttons: Array<ButtonOptions>?
            public var items: Array<ItemOptions>?
            public var progress: Number?
            public var isClickable: Boolean?
        }
        public native trait OnClosed {
            public fun addListener(callback: (notificationId: String, byUser: Boolean) -> Unit)
        }
        public native trait OnClicked {
            public fun addListener(callback: (notificationId: String) -> Unit)
        }
        public native trait OnButtonClicked {
            public fun addListener(callback: (notificationId: String, buttonIndex: Number) -> Unit)
        }
        public native trait OnPermissionLevelChanged {
            public fun addListener(callback: (level: String) -> Unit)
        }
        public native trait OnShowSettings {
            public fun addListener(callback: ()->Unit)
        }
        public native var onClosed: OnClosed = noImpl
        public native var onClicked: OnClicked = noImpl
        public native var onButtonClicked: OnButtonClicked = noImpl
        public native var onPermissionLevelChanged: OnPermissionLevelChanged = noImpl
        public native var onShowSettings: OnShowSettings = noImpl
        public native fun create(notificationId: String, options: NotificationOptions, callback: (notificationId: String) -> Unit): Unit = noImpl
        public native fun update(notificationId: String, options: NotificationOptions, callback: (wasUpdated: Boolean) -> Unit): Unit = noImpl
        public native fun clear(notificationId: String, callback: (wasCleared: Boolean) -> Unit): Unit = noImpl
        public native fun getAll(callback: (notifications: Any) -> Unit): Unit = noImpl
        public native fun getPermissionLevel(callback: (level: String) -> Unit): Unit = noImpl
    }

    public native object omnibox {
        public native trait SuggestResult {
            public var content: String
            public var description: String
        }
        public native trait Suggestion {
            public var description: String
        }
        public native trait OmniboxInputEnteredEvent : chrome.events.Event<(text: String) -> Unit> {
            override fun addListener(callback: (text: String) -> Unit)
        }
        public native trait OmniboxInputChangedEvent : chrome.events.Event<(text: String, suggest: (suggestResults: Array<SuggestResult>) -> Unit) -> Unit> {
            override fun addListener(callback: (text: String, suggest: (suggestResults: Array<SuggestResult>) -> Unit) -> Unit)
        }
        public native trait OmniboxInputStartedEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait OmniboxInputCancelledEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native fun setDefaultSuggestion(suggestion: Suggestion): Unit = noImpl
        public native var onInputEntered: OmniboxInputEnteredEvent = noImpl
        public native var onInputChanged: OmniboxInputChangedEvent = noImpl
        public native var onInputStarted: OmniboxInputStartedEvent = noImpl
        public native var onInputCancelled: OmniboxInputCancelledEvent = noImpl
    }

    public native object pageAction {
        public native trait PageActionClickedEvent : chrome.events.Event<(tab: chrome.tabs.Tab) -> Unit> {
            override fun addListener(callback: (tab: chrome.tabs.Tab) -> Unit)
        }
        public native trait TitleDetails {
            public var tabId: Number
            public var title: String
        }
        public native trait GetDetails {
            public var tabId: Number
        }
        public native trait PopupDetails {
            public var tabId: Number
            public var popup: String
        }
        public native trait IconDetails {
            public var tabId: Number
            public var iconIndex: Number?
            public var imageData: Any? // TODO:  imageData: ImageData
            public var path: Any?
        }
        public native fun hide(tabId: Number): Unit = noImpl
        public native fun show(tabId: Number): Unit = noImpl
        public native fun setTitle(details: TitleDetails): Unit = noImpl
        public native fun setPopup(details: PopupDetails): Unit = noImpl
        public native fun getTitle(details: GetDetails, callback: (result: String) -> Unit): Unit = noImpl
        public native fun getPopup(details: GetDetails, callback: (result: String) -> Unit): Unit = noImpl
        public native fun setIcon(details: IconDetails, callback: (()->Unit)? = null): Unit = noImpl
        public native var onClicked: PageActionClickedEvent = noImpl
    }

    public native object pageCapture {
        public native trait SaveDetails {
            public var tabId: Number
        }
        public native fun saveAsMHTML(details: SaveDetails, callback: (mhtmlData: Any) -> Unit): Unit = noImpl
    }
    /*
    public object permissions {
        public trait Permissions {
            public var origins: Array<String>?
            public var permissions: Array<String>?
        }
        public trait PermissionsRemovedEvent {
            public fun addListener(callback: (permissions: Permissions) -> Unit)
        }
        public trait PermissionsAddedEvent {
            public fun addListener(callback: (permissions: Permissions) -> Unit)
        }
        public fun contains(permissions: Permissions, callback: (result: Boolean) -> Unit): Unit = noImpl
        public fun getAll(callback: (permissions: Permissions) -> Unit): Unit = noImpl
        public fun request(permissions: Permissions, callback: ((granted: Boolean) -> Unit)? = null): Unit = noImpl
        public fun remove(permissions: Permissions, callback: ((removed: Boolean) -> Unit)? = null): Unit = noImpl
        public var onRemoved: PermissionsRemovedEvent = noImpl
        public var onAdded: PermissionsAddedEvent = noImpl
    }
    module
    public object privacy {
        public trait Services {
            public var spellingServiceEnabled: chrome.types.ChromeSetting
            public var searchSuggestEnabled: chrome.types.ChromeSetting
            public var instantEnabled: chrome.types.ChromeSetting
            public var alternateErrorPagesEnabled: chrome.types.ChromeSetting
            public var safeBrowsingEnabled: chrome.types.ChromeSetting
            public var autofillEnabled: chrome.types.ChromeSetting
            public var translationServiceEnabled: chrome.types.ChromeSetting
        }
        public trait Network {
            public var networkPredictionEnabled: chrome.types.ChromeSetting
        }
        public trait Websites {
            public var thirdPartyCookiesAllowed: chrome.types.ChromeSetting
            public var referrersEnabled: chrome.types.ChromeSetting
            public var hyperlinkAuditingEnabled: chrome.types.ChromeSetting
            public var protectedContentEnabled: chrome.types.ChromeSetting
        }
        public var services: Services = noImpl
        public var network: Network = noImpl
        public var websites: Websites = noImpl
    }
    module
    public object proxy {
        public trait PacScript {
            public var url: String?
            public var mandatory: Boolean?
            public var data: String?
        }
        public trait ProxyConfig {
            public var rules: ProxyRules?
            public var pacScript: PacScript?
            public var mode: String
        }
        public trait ProxyServer {
            public var host: String
            public var scheme: String?
            public var port: Number?
        }
        public trait ProxyRules {
            public var proxyForFtp: ProxyServer?
            public var proxyForHttp: ProxyServer?
            public var facllbackProxy: ProxyServer?
            public var singleProxy: ProxyServer?
            public var proxyForHttps: ProxyServer?
            public var bypassList: Array<String>?
        }
        public trait ErrorDetails {
            public var details: String
            public var error: String
            public var fatal: Boolean
        }
        public trait ProxyErrorEvent : chrome.events.Event {
            override fun addListener(callback: (details: ErrorDetails) -> Unit)
        }
        public var settings: chrome.types.ChromeSetting = noImpl
        public var onProxyError: ProxyErrorEvent = noImpl
    }
    */

    public native object runtime {
        public native var lastError: LastError = noImpl
        public native var id: String = noImpl
        public native trait LastError {
            public var message: String?
        }
        public native trait ConnectInfo {
            public var name: String?
        }
        public native trait InstalledDetails {
            public var reason: String
            public var previousVersion: String?
        }
        public native trait MessageOptions {
            public var includeTlsChannelId: Boolean?
        }
        public native trait MessageSender {
            public var id: String
            public var tab: chrome.tabs.Tab?
        }
        public native trait PlatformInfo {
            public var os: String
            public var arch: String
            public var nacl_arch: String
        }
        public native trait Port {
            public var postMessage: ()->Unit
            public var sender: MessageSender?
            public var onDisconnect: chrome.events.Event<()->Unit>
            public var onMessage: chrome.events.Event<()->Unit>
            public var name: String
        }
        public native trait UpdateAvailableDetails {
            public var version: String
        }
        public native trait UpdateCheckDetails {
            public var version: String
        }
        public native trait ExtensionMessageEvent : chrome.events.Event<(message: Any, sender: MessageSender, sendResponse: ()->Unit) -> Unit> {
            override fun addListener(callback: (message: Any, sender: MessageSender, sendResponse: ()->Unit) -> Unit)
        }
        public native trait ExtensionMessageExternalEvent : chrome.events.Event<(message: Any, sender: MessageSender, sendResponse: ()->Unit) -> Unit> {
            override fun addListener(callback: (message: Any, sender: MessageSender, sendResponse: ()->Unit) -> Unit)
        }
        public native trait ExtensionConnectEvent : chrome.events.Event<(port: Port) -> Unit> {
            override fun addListener(callback: (port: Port) -> Unit)
        }
        public native trait ExtensionConnectExternalEvent : chrome.events.Event<(port: Port) -> Unit> {
            override fun addListener(callback: (port: Port) -> Unit)
        }
        public native trait RuntimeSuspendEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait RuntimeStartupEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait RuntimeInstalledEvent : chrome.events.Event<(details: InstalledDetails) -> Unit> {
            override fun addListener(callback: (details: InstalledDetails) -> Unit)
        }
        public native trait RuntimeSuspendCanceledEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait RuntimeMessageEvent : chrome.events.Event<()->Unit> {
            override fun addListener(callback: ()->Unit)
        }
        public native trait RuntimeRestartRequiredEvent : chrome.events.Event<(reason: String) -> Unit> {
            override fun addListener(callback: (reason: String) -> Unit)
        }
        public native trait RuntimeUpdateAvailableEvent : chrome.events.Event<(details: UpdateAvailableDetails) -> Unit> {
            override fun addListener(callback: (details: UpdateAvailableDetails) -> Unit)
        }
        public native fun connect(connectInfo: ConnectInfo? = null): Port = noImpl
        public native fun connect(extensionId: String, connectInfo: ConnectInfo? = null): Port = noImpl
        public native fun connectNative(application: String): Port = noImpl
        public native fun getBackgroundPage(callback: (backgroundPage: chrome.ext.chrome.app.window? = null) -> Unit): Unit = noImpl
        public native fun getManifest(): Any = noImpl  // TODO: what datatype is this?
        public native fun getPackageDirectoryEntry(callback: (directoryEntry: Any) -> Unit): Unit = noImpl
        public native fun getPlatformInfo(callback: (platformInfo: PlatformInfo) -> Unit): Unit = noImpl
        public native fun getURL(path: String): String = noImpl
        public native fun reload(): Unit = noImpl
        public native fun requestUpdateCheck(callback: (status: String, details: UpdateCheckDetails? = null) -> Unit): Unit = noImpl
        public native fun restart(): Unit = noImpl
        public native fun sendMessage(message: Any, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun sendMessage(message: Any, options: MessageOptions, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun sendMessage(extensionId: String, message: Any, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun sendMessage(extensionId: String, message: Any, options: MessageOptions, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun sendNativeMessage(application: String, message: Any, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun setUninstallUrl(url: String): Unit = noImpl
        public native var onConnect: ExtensionConnectEvent = noImpl
        public native var onConnectExternal: ExtensionConnectExternalEvent = noImpl
        public native var onSuspend: RuntimeSuspendEvent = noImpl
        public native var onStartup: RuntimeStartupEvent = noImpl
        public native var onInstalled: RuntimeInstalledEvent = noImpl
        public native var onSuspendCanceled: RuntimeSuspendCanceledEvent = noImpl
        public native var onMessage: ExtensionMessageEvent = noImpl
        public native var onMessageExternal: ExtensionMessageExternalEvent = noImpl
        public native var onRestartRequired: RuntimeRestartRequiredEvent = noImpl
        public native var onUpdateAvailable: RuntimeUpdateAvailableEvent = noImpl
    }

    public native object scriptBadge {
        public native trait GetPopupDetails {
            public var tabId: Number
        }
        public native trait AttentionDetails {
            public var tabId: Number
        }
        public native trait SetPopupDetails {
            public var tabId: Number
            public var popup: String
        }
        public native trait ScriptBadgeClickedEvent : chrome.events.Event<(tab: chrome.tabs.Tab) -> Unit> {
            override fun addListener(callback: (tab: chrome.tabs.Tab) -> Unit)
        }
        public native fun getPopup(details: GetPopupDetails, callback: ()->Unit): Unit = noImpl
        public native fun getAttention(details: AttentionDetails): Unit = noImpl
        public native fun setPopup(details: SetPopupDetails): Unit = noImpl
        public native var onClicked: ScriptBadgeClickedEvent = noImpl
    }

    public native object storage {
        public native trait StorageArea {
            public fun getBytesInUse(callback: (bytesInUse: Number) -> Unit)
            public fun getBytesInUse(keys: String, callback: (bytesInUse: Number) -> Unit)
            public fun getBytesInUse(keys: Array<String>, callback: (bytesInUse: Number) -> Unit)
            public fun clear(callback: (()->Unit)? = null)
            public fun set(items: Any, callback: (()->Unit)? = null)
            public fun remove(keys: String, callback: (()->Unit)? = null)
            public fun remove(keys: Array<String>, callback: (()->Unit)? = null)
            public fun get(callback: (items: Any) -> Unit)
            public fun get(keys: String, callback: (items: Any) -> Unit)
            public fun get(keys: Array<String>, callback: (items: Any) -> Unit)
            public fun get(keys: Any, callback: (items: Any) -> Unit)
        }
        public native trait StorageChange {
            public var newValue: Any?
            public var oldValue: Any?
        }
        public native trait Local : StorageArea {
            public var QUOTA_BYTES: Number
        }
        public native trait Sync : StorageArea {
            public var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Number
            public var QUOTA_BYTES: Number
            public var QUOTA_BYTES_PER_ITEM: Number
            public var MAX_ITEMS: Number
            public var MAX_WRITE_OPERATIONS_PER_HOUR: Number
        }
        public native trait StorageChangedEvent : chrome.events.Event<(changes: Any, areaName: String) -> Unit> {    // TODO: changes: Object is probably something else
            override fun addListener(callback: (changes: Any, areaName: String) -> Unit)
        }
        public native var local: Local = noImpl
        public native var sync: Sync = noImpl
        public native var onChanged: StorageChangedEvent = noImpl
    }

    /*
    public object socket {
        public trait CreateInfo {
            public var socketId: Number
        }
        public trait AcceptInfo {
            public var resultCode: Number
            public var socketId: Number?
        }
        public trait ReadInfo {
            public var resultCode: Number
            public var data: ArrayBuffer
        }
        public trait WriteInfo {
            public var bytesWritten: Number
        }
        public trait RecvFromInfo {
            public var resultCode: Number
            public var data: ArrayBuffer
            public var port: Number
            public var address: String
        }
        public trait SocketInfo {
            public var socketType: String
            public var localPort: Number?
            public var peerAddress: String?
            public var peerPort: Number?
            public var localAddress: String?
            public var connected: Boolean
        }
        public trait NetworkInterface {
            public var name: String
            public var address: String
        }
        public fun create(`type`: String, options: Object? = null, callback: ((createInfo: CreateInfo) -> Unit)? = null): Unit = noImpl
        public fun destroy(socketId: Number): Unit = noImpl
        public fun connect(socketId: Number, hostname: String, port: Number, callback: (result: Number) -> Unit): Unit = noImpl
        public fun bind(socketId: Number, address: String, port: Number, callback: (result: Number) -> Unit): Unit = noImpl
        public fun disconnect(socketId: Number): Unit = noImpl
        public fun read(socketId: Number, bufferSize: Number? = null, callback: ((readInfo: ReadInfo) -> Unit)? = null): Unit = noImpl
        public fun write(socketId: Number, data: ArrayBuffer, callback: ((writeInfo: WriteInfo) -> Unit)? = null): Unit = noImpl
        public fun recvFrom(socketId: Number, bufferSize: Number? = null, callback: ((recvFromInfo: RecvFromInfo) -> Unit)? = null): Unit = noImpl
        public fun sendTo(socketId: Number, data: ArrayBuffer, address: String, port: Number, callback: ((writeInfo: WriteInfo) -> Unit)? = null): Unit = noImpl
        public fun listen(socketId: Number, address: String, port: Number, backlog: Number? = null, callback: ((result: Number) -> Unit)? = null): Unit = noImpl
        public fun accept(socketId: Number, callback: ((acceptInfo: AcceptInfo) -> Unit)? = null): Unit = noImpl
        public fun setKeepAlive(socketId: Number, enable: Boolean, delay: Number? = null, callback: ((result: Boolean) -> Unit)? = null): Unit = noImpl
        public fun setNoDelay(socketId: Number, noDelay: Boolean, callback: ((result: Boolean) -> Unit)? = null): Unit = noImpl
        public fun getInfo(socketId: Number, callback: (result: SocketInfo) -> Unit): Unit = noImpl
        public fun getNetworkList(callback: (result: Array<NetworkInterface>) -> Unit): Unit = noImpl
    }
    */

    /*
    public object tabCapture {
        public trait CaptureInfo {
            public var tabId: Number
            public var status: String
            public var fullscreen: Boolean
        }
        public trait CaptureOptions {
            public var audio: Boolean?
            public var video: Boolean?
            public var audioConstraints: MediaTrackConstraints?
            public var videoConstraints: MediaTrackConstraints?
        }
        public fun capture(options: CaptureOptions, callback: (stream: LocalMediaStream) -> Unit): Unit = noImpl
        public fun getCapturedTabs(callback: (result: Array<CaptureInfo>) -> Unit): Unit = noImpl
    }
    */

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
        public native trait InjectDetails {
            public var allFrames: Boolean?
            public var code: String?
            public var runAt: String?
            public var file: String?
        }
        public native trait CreateProperties {
            public var index: Number?
            public var openerTabId: Number?
            public var url: String?
            public var pinned: Boolean?
            public var windowId: Number?
            public var active: Boolean?
        }
        public native trait MoveProperties {
            public var index: Number
            public var windowId: Number?
        }
        public native trait UpdateProperties {
            public var pinned: Boolean?
            public var openerTabId: Number?
            public var url: String?
            public var highlighted: Boolean?
            public var active: Boolean?
        }
        public native trait CaptureVisibleTabOptions {
            public var quality: Number?
            public var format: String?
        }
        public native trait ReloadProperties {
            public var bypassCache: Boolean?
        }
        public native trait ConnectInfo {
            public var name: String?
        }
        public native trait HighlightInfo {
            public var tabs: Array<Number>
            public var windowId: Number?
        }
        /*
        public native trait QueryInfo {
            public var status: String?
            public var lastFocusedWindow: Boolean?
            public var windowId: Number?
            public var windowType: String?
            public var active: Boolean?
            public var index: Number?
            public var title: String?
            public var url: String?
            public var currentWindow: Boolean?
            public var highlighted: Boolean?
            public var pinned: Boolean?
        }
        */

        public native trait TabHighlightInfo {
            public var windowId: Number
            public var tabIds: Array<Number>
        }
        public native trait TabRemoveInfo {
            public var windowId: Number
            public var isWindowClosing: Boolean
        }
        public native trait TabAttachInfo {
            public var newPosition: Number
            public var newWindowId: Number
        }
        public native trait TabChangeInfo {
            public var status: String?
            public var pinned: Boolean?
            public var url: String?
        }
        public native trait TabMoveInfo {
            public var toIndex: Number
            public var windowId: Number
            public var fromIndex: Number
        }
        public native trait TabDetachInfo {
            public var oldWindowId: Number
            public var oldPosition: Number
        }
        public native trait TabActiveInfo {
            public var tabId: Number
            public var windowId: Number
        }
        public native trait TabHighlightedEvent : chrome.events.Event<(highlightInfo: HighlightInfo) -> Unit> {
            override fun addListener(callback: (highlightInfo: HighlightInfo) -> Unit)
        }
        public native trait TabRemovedEvent : chrome.events.Event<(tabId: Number, removeInfo: TabRemoveInfo) -> Unit> {
            override fun addListener(callback: (tabId: Number, removeInfo: TabRemoveInfo) -> Unit)
        }
        public native trait TabUpdatedEvent : chrome.events.Event<(tabId: Number, changeInfo: TabChangeInfo, tab: Tab) -> Unit> {
            override fun addListener(callback: (tabId: Number, changeInfo: TabChangeInfo, tab: Tab) -> Unit)
        }
        public native trait TabAttachedEvent : chrome.events.Event<(tabId: Number, attachInfo: TabAttachInfo) -> Unit> {
            override fun addListener(callback: (tabId: Number, attachInfo: TabAttachInfo) -> Unit)
        }
        public native trait TabMovedEvent : chrome.events.Event< (tabId: Number, moveInfo: TabMoveInfo) -> Unit> {
            override fun addListener(callback: (tabId: Number, moveInfo: TabMoveInfo) -> Unit)
        }
        public native trait TabDetachedEvent : chrome.events.Event<(tabId: Number, detachInfo: TabDetachInfo) -> Unit> {
            override fun addListener(callback: (tabId: Number, detachInfo: TabDetachInfo) -> Unit)
        }
        public native trait TabCreatedEvent : chrome.events.Event< (tab: Tab) -> Unit> {
            override fun addListener(callback: (tab: Tab) -> Unit)
        }
        public native trait TabActivatedEvent : chrome.events.Event<(activeInfo: TabActiveInfo) -> Unit> {
            override fun addListener(callback: (activeInfo: TabActiveInfo) -> Unit)
        }
        public native trait TabReplacedEvent : chrome.events.Event<(addedTabId: Number, removedTabId: Number) -> Unit> {
            override fun addListener(callback: (addedTabId: Number, removedTabId: Number) -> Unit)
        }
        public native fun executeScript(details: InjectDetails, callback: ((result: Array<Any>) -> Unit)? = null): Unit = noImpl
        public native fun executeScript(tabId: Number, details: InjectDetails, callback: ((result: Array<Any>) -> Unit)? = null): Unit = noImpl
        public native fun get(tabId: Number, callback: (tab: Tab) -> Unit): Unit = noImpl
        public native fun getCurrent(callback: (tab: Tab? = null) -> Unit): Unit = noImpl
        public native fun create(createProperties: CreateProperties, callback: ((tab: Tab) -> Unit)? = null): Unit = noImpl
        public native fun move(tabId: Number, moveProperties: MoveProperties, callback: ((tab: Tab) -> Unit)? = null): Unit = noImpl
        public native fun move(tabIds: Array<Number>, moveProperties: MoveProperties, callback: ((tabs: Array<Tab>) -> Unit)? = null): Unit = noImpl
        public native fun update(updateProperties: UpdateProperties, callback: ((tab: Tab? = null) -> Unit)? = null): Unit = noImpl
        public native fun update(tabId: Number, updateProperties: UpdateProperties, callback: ((tab: Tab? = null) -> Unit)? = null): Unit = noImpl
        public native fun remove(tabId: Number, callback: (()->Unit)? = null): Unit = noImpl
        public native fun remove(tabIds: Array<Number>, callback: (()->Unit)? = null): Unit = noImpl
        public native fun captureVisibleTab(callback: (dataUrl: String) -> Unit): Unit = noImpl
        public native fun captureVisibleTab(windowId: Number, callback: (dataUrl: String) -> Unit): Unit = noImpl
        public native fun captureVisibleTab(options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit): Unit = noImpl
        public native fun captureVisibleTab(windowId: Number, options: CaptureVisibleTabOptions, callback: (dataUrl: String) -> Unit): Unit = noImpl
        public native fun reload(tabId: Number? = null, reloadProperties: ReloadProperties? = null, func: (()->Unit)? = null): Unit = noImpl
        public native fun duplicate(tabId: Number, callback: ((tab: Tab? = null) -> Unit)? = null): Unit = noImpl
        public native fun sendMessage(tabId: Number, message: Any, responseCallback: ((response: Any) -> Unit)? = null): Unit = noImpl
        public native fun connect(tabId: Number, connectInfo: ConnectInfo? = null): Unit = noImpl
        public native fun insertCSS(tabId: Number, details: InjectDetails, callback: (()->Unit)? = null): Unit = noImpl
        public native fun highlight(highlightInfo: HighlightInfo, callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun query(queryInfo: Any, callback: (result: Array<Tab>) -> Unit): Unit = noImpl
        public native fun detectLanguage(callback: (language: String) -> Unit): Unit = noImpl
        public native fun detectLanguage(tabId: Number, callback: (language: String) -> Unit): Unit = noImpl
        public native var onHighlighted: TabHighlightedEvent = noImpl
        public native var onRemoved: TabRemovedEvent = noImpl
        public native var onUpdated: TabUpdatedEvent = noImpl
        public native var onAttached: TabAttachedEvent = noImpl
        public native var onMoved: TabMovedEvent = noImpl
        public native var onDetached: TabDetachedEvent = noImpl
        public native var onCreated: TabCreatedEvent = noImpl
        public native var onActivated: TabActivatedEvent = noImpl
        public native var onReplaced: TabReplacedEvent = noImpl
    }

    public native object topSites {
        public native trait MostVisitedURL {
            public var url: String
            public var title: String
        }
        public native fun get(callback: (data: MostVisitedURL) -> Unit): Unit = noImpl
    }

    /*
    public object tts {
        public trait TtsEvent {
            public var charIndex: Number?
            public var errorMessage: String?
            public var `type`: String
        }
        public trait TtsVoice {
            public var lang: String?
            public var gender: String?
            public var voiceName: String?
            public var extensionsId: String?
            public var eventTypes: Array<String>?
        }
        public trait SpeakOptions {
            public var volume: Number?
            public var enqueue: Boolean?
            public var rate: Number?
            public var onEvent: ((event: TtsEvent) -> Unit)?
            public var pitch: Number?
            public var lang: String?
            public var voiceName: String?
            public var extensionId: String?
            public var gender: String?
            public var requiredEventTypes: Array<String>?
            public var desiredEventTypes: Array<String>?
        }
        public fun isSpeaking(callback: ((speaking: Boolean) -> Unit)? = null): Unit = noImpl
        public fun stop(): Unit = noImpl
        public fun getVoices(callback: ((voices: Array<TtsVoice>) -> Unit)? = null): Unit = noImpl
        public fun speak(utterance: String, options: SpeakOptions? = null, callback: Function? = null): Unit = noImpl
    }
    module
    public object ttsEngine {
        public trait SpeakOptions {
            public var lang: String?
            public var voiceName: String?
            public var gender: String?
            public var volume: Number?
            public var rate: Number?
            public var pitch: Number?
        }
        public trait TtsEngineSpeakEvent : chrome.events.Event {
            override fun addListener(callback: (utterance: String, options: SpeakOptions, sendTtsEvent: (event: chrome.tts.TtsEvent) -> Unit) -> Unit)
        }
        public trait TtsEngineStopEvent : chrome.events.Event {
            override fun addListener(callback: Function)
        }
        public var onSpeak: TtsEngineSpeakEvent = noImpl
        public var onStop: TtsEngineStopEvent = noImpl
    }
    */

    public native object types {
        public native trait ChromeSettingSetDetails {
            public var scope: String?
            public var value: Any
        }
        public native trait ChromeSettingGetDetails {
            public var incognito: Boolean?
        }
        public native trait ChromeSettingGetResultDetails {
            public var levelOfControl: String
            public var value: Any
            public var incognitoSpecific: Boolean?
        }
        public native trait ChromeSettingChangedEvent : chrome.events.Event<(details: ChromeSettingGetResultDetails) -> Unit> {
            override fun addListener(callback: (details: ChromeSettingGetResultDetails) -> Unit)
        }
        public native trait `T$0` {
            public var scope: String?
            public var callback: (()->Unit)?
        }
        public native trait ChromeSetting {
            public var details: `T$0`
            public fun set(details: ChromeSettingSetDetails, callback:  (()->Unit)? = null)
            public fun get(details: ChromeSettingGetDetails, callback: ChromeSettingGetResultDetails? = null)
            public var onChange: ChromeSettingChangedEvent
        }
    }

    public native object webNavigation {
        public native trait GetFrameDetails {
            public var processId: Number
            public var tabId: Number
            public var frameId: Number
        }
        public native trait GetFrameResultDetails {
            public var url: String
            public var errorOccurred: Boolean
        }
        public native trait GetAllFrameDetails {
            public var tabId: Number
        }
        public native trait ReferenceFragmentUpdatedDetails {
            public var processId: Number
            public var tabId: Number
            public var transitionType: String
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var transitionQualifiers: String
        }
        public native trait CompletedDetails {
            public var processId: Number
            public var tabId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
        }
        public native trait HistoryStateUpdatedDetails {
            public var processId: Number
            public var tabId: Number
            public var transitionType: String
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var transitionQualifiers: Array<String>
        }
        public native trait CreatedNavigationTargetDetails {
            public var tabId: Number
            public var url: String
            public var timeStamp: Number
            public var sourceTabId: Number
            public var sourceProcessId: Number
            public var sourceFrameId: Number
        }
        public native trait TabReplacedDetails {
            public var tabId: Number
            public var replacedTabId: Number
            public var timeStamp: Number
        }
        public native trait BeforeNavigateDetails {
            public var processId: Number
            public var tabId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
        }
        public native trait CommittedDetails {
            public var processId: Number
            public var tabId: Number
            public var transitionType: String
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var transitionQualifiers: Array<String>
        }
        public native trait DomContentLoadedDetails {
            public var processId: Number
            public var tabId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
        }
        public native trait ErrorOccurredDetails {
            public var processId: Number
            public var tabId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var error: String
        }
        public native trait WebNavigationReferenceFragmentUpdatedEvent : chrome.events.Event<(details: ReferenceFragmentUpdatedDetails) -> Unit> {
            override fun addListener(callback: (details: ReferenceFragmentUpdatedDetails) -> Unit)
        }
        public native trait WebNavigationCompletedEvent : chrome.events.Event< (details: CompletedDetails) -> Unit> {
            override fun addListener(callback: (details: CompletedDetails) -> Unit)
        }
        public native trait WebNavigationHistoryStateUpdatedEvent : chrome.events.Event<(details: HistoryStateUpdatedDetails) -> Unit> {
            override fun addListener(callback: (details: HistoryStateUpdatedDetails) -> Unit)
        }
        public native trait WebNavigationCreatedNavigationTargetEvent : chrome.events.Event<(details: CreatedNavigationTargetDetails) -> Unit> {
            override fun addListener(callback: (details: CreatedNavigationTargetDetails) -> Unit)
        }
        public native trait WebNavigationTabReplacedEvent : chrome.events.Event<(details: TabReplacedDetails) -> Unit> {
            override fun addListener(callback: (details: TabReplacedDetails) -> Unit)
        }
        public native trait WebNavigationBeforeNavigateEvent : chrome.events.Event<(details: BeforeNavigateDetails) -> Unit> {
            override fun addListener(callback: (details: BeforeNavigateDetails) -> Unit)
        }
        public native trait WebNavigationCommittedEvent : chrome.events.Event<(details: CommittedDetails) -> Unit> {
            override fun addListener(callback: (details: CommittedDetails) -> Unit)
        }
        public native trait WebNavigationDomContentLoadedEvent : chrome.events.Event<(details: DomContentLoadedDetails) -> Unit> {
            override fun addListener(callback: (details: DomContentLoadedDetails) -> Unit)
        }
        public native trait WebNavigationErrorOccurredEvent : chrome.events.Event< (details: ErrorOccurredDetails) -> Unit> {
            override fun addListener(callback: (details: ErrorOccurredDetails) -> Unit)
        }
        public native fun getFrame(details: GetFrameDetails, callback: (details: GetFrameResultDetails? = null) -> Unit): Unit = noImpl
        public native fun getAllFrames(details: GetAllFrameDetails, callback: (details: Array<Any>? = null) -> Unit): Unit = noImpl
        public native var onReferenceFragmentUpdated: WebNavigationReferenceFragmentUpdatedEvent = noImpl
        public native var onCompleted: WebNavigationCompletedEvent = noImpl
        public native var onHistoryStateUpdated: WebNavigationHistoryStateUpdatedEvent = noImpl
        public native var onCreatedNavigationTarget: WebNavigationCreatedNavigationTargetEvent = noImpl
        public native var onTabReplaced: WebNavigationTabReplacedEvent = noImpl
        public native var onBeforeNavigate: WebNavigationBeforeNavigateEvent = noImpl
        public native var onCommitted: WebNavigationCommittedEvent = noImpl
        public native var onDOMContentLoaded: WebNavigationDomContentLoadedEvent = noImpl
        public native var onErrorOccurred: WebNavigationErrorOccurredEvent = noImpl
    }

    public native object webRequest {
        public native trait AuthCredentials {
            public var username: String
            public var password: String
        }
        public native trait HttpHeader {
            public var name: String
            public var value: String?
            public var binaryValue: Any?  // TODO: binaryValue: ArrayBuffer
        }
        public native trait BlockingResponse {
            public var cancel: Boolean?
            public var redirectUrl: String?
            public var responseHeaders: Array<HttpHeader>?
            public var authCredentials: AuthCredentials?
            public var requestHeaders: Array<HttpHeader>?
        }
        public native trait RequestFilter {
            public var tabId: Number?
            public var types: Array<String>?
            public var urls: Array<String>
            public var windowId: Number?
        }
        public native trait UploadData {
            public var bytes: Array<Any>?
            public var file: String?
        }
        public native trait OnCompletedDetails {
            public var tabId: Number
            public var ip: String?
            public var statusLine: String?
            public var frameId: Number
            public var responseHeaders: Array<HttpHeader>?
            public var parentFrameId: Number
            public var fromCache: Boolean
            public var url: String
            public var timeStamp: Number
            public var requestId: String
            public var `type`: String
            public var method: String
            public var statusCode: Number
        }
        public native trait OnHeadersReceivedDetails {
            public var tabId: Number
            public var parentFrameId: Number
            public var url: String
            public var timeStamp: Number
            public var statusLine: String?
            public var frameId: Number
            public var requestId: String
            public var responseHeaders: Array<HttpHeader>?
            public var `type`: String
            public var method: String
        }
        public native trait OnBeforeRedirectDetails {
            public var tabId: Number
            public var ip: String?
            public var statusLine: String?
            public var frameId: Number
            public var responseHeaders: Array<HttpHeader>?
            public var parentFrameId: Number
            public var fromCache: Boolean
            public var url: String
            public var timeStamp: Number
            public var requestId: String
            public var redirectUrl: String
            public var `type`: String
            public var method: String
            public var statusCode: Number
        }
        public native trait Challenger {
            public var host: String
            public var port: Number
        }
        public native trait OnAuthRequiredDetails {
            public var tabId: Number
            public var statusLine: String?
            public var frameId: Number
            public var challenger: Challenger
            public var responseHeaders: Array<HttpHeader>?
            public var isProxy: Boolean
            public var realm: String?
            public var parentFrameId: Number
            public var url: String
            public var timeStamp: Number
            public var requestId: String
            public var scheme: String
            public var `type`: String
            public var method: String
        }
        public native trait OnBeforeSendHeadersDetails {
            public var tabId: Number
            public var parentFrameId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var requestId: Number
            public var requestHeaders: Array<HttpHeader>?
            public var `type`: String
            public var method: String
        }
        public native trait OnErrorOccurredDetails {
            public var tabId: Number
            public var ip: String?
            public var frameId: Number
            public var parentFrameId: Number
            public var fromCache: Boolean
            public var url: String
            public var timeStamp: Number
            public var requestId: String
            public var error: String
            public var `type`: String
            public var method: String
        }
        public native trait OnResponseStartedDetails {
            public var tabId: Number
            public var ip: String?
            public var statusLine: String?
            public var frameId: Number
            public var responseHeaders: Array<HttpHeader>?
            public var parentFrameId: Number
            public var fromCache: Boolean
            public var url: String
            public var timeStamp: Number
            public var requestId: String
            public var `type`: String
            public var method: String
            public var statusCode: Number
        }
        public native trait OnSendHeadersDetails {
            public var tabId: Number
            public var parentFrameId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var requestId: String
            public var requestHeaders: Array<HttpHeader>?
            public var `type`: String
            public var method: String
        }
        public native trait RequestBody {
            public var raw: UploadData?
            public var error: String?
            public var formData: Any?
        }
        public native trait OnBeforeRequestDetails {
            public var tabId: Number
            public var parentFrameId: Number
            public var url: String
            public var timeStamp: Number
            public var frameId: Number
            public var requestBody: RequestBody
        }

        public native trait WebRequestCompletedEvent : chrome.events.Event<(details: OnCompletedDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnCompletedDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestHeadersReceivedEvent : chrome.events.Event<(details: OnHeadersReceivedDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnHeadersReceivedDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestBeforeRedirectEvent : chrome.events.Event<(details: OnBeforeRedirectDetails) -> BlockingResponse> {
            fun addListener(callback: (details: OnBeforeRedirectDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestAuthRequiredEvent : chrome.events.Event<(details: OnAuthRequiredDetails, callback: ((response: BlockingResponse) -> Unit)? = null, filter: RequestFilter? = null, opt_extraInfoSpec: Array<String>? = null) -> Unit> {
            override fun addListener(callback: (details: OnAuthRequiredDetails, callback: ((response: BlockingResponse) -> Unit)? = null, filter: RequestFilter? = null, opt_extraInfoSpec: Array<String>? = null) -> Unit)
        }
        public native trait WebRequestBeforeSendHeadersEvent : chrome.events.Event<(details: OnBeforeSendHeadersDetails) -> BlockingResponse> {
            fun addListener(callback: (details: OnBeforeSendHeadersDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestErrorOccurredEvent : chrome.events.Event<(details: OnErrorOccurredDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnErrorOccurredDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestResponseStartedEvent : chrome.events.Event< (details: OnResponseStartedDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnResponseStartedDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestSendHeadersEvent : chrome.events.Event<(details: OnSendHeadersDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnSendHeadersDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native trait WebRequestBeforeRequestEvent : chrome.events.Event<(details: OnBeforeRequestDetails) -> BlockingResponse> {
             fun addListener(callback: (details: OnBeforeRequestDetails) -> BlockingResponse, filter: RequestFilter?, opt_extraInfoSpec: Array<String>?)
        }
        public native var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Number = noImpl
        public native fun handlerBehaviorChanged(callback: (()->Unit)? = null): Unit = noImpl
        public native var onCompleted: WebRequestCompletedEvent = noImpl
        public native var onHeadersReceived: WebRequestHeadersReceivedEvent = noImpl
        public native var onBeforeRedirect: WebRequestBeforeRedirectEvent = noImpl
        public native var onAuthRequired: WebRequestAuthRequiredEvent = noImpl
        public native var onBeforeSendHeaders: WebRequestBeforeSendHeadersEvent = noImpl
        public native var onErrorOccurred: WebRequestErrorOccurredEvent = noImpl
        public native var onResponseStarted: WebRequestResponseStartedEvent = noImpl
        public native var onSendHeaders: WebRequestSendHeadersEvent = noImpl
        public native var onBeforeRequest: WebRequestBeforeRequestEvent = noImpl
    }

    public native object webstore {
        public native fun install(url: String? = null, successCallback: (()->Unit)? = null, failureCallback: ((error: String) -> Unit)? = null): Unit = noImpl
    }


    public native object windows {
        public native trait Window {
            public var tabs: Array<chrome.tabs.Tab>?
            public var top: Number
            public var height: Number
            public var width: Number
            public var state: String
            public var focused: Boolean
            public var alwaysOnTop: Boolean
            public var incognito: Boolean
            public var `type`: String
            public var id: Number
            public var left: Number
        }
        public native trait GetInfo {
            public var populate: Boolean?
        }
        public native trait CreateData {
            public var tabId: Number?
            public var url: String?
            public var top: Number?
            public var height: Number?
            public var width: Number?
            public var focused: Boolean?
            public var incognito: Boolean?
            public var `type`: String?
            public var left: Number?
        }
        public native trait UpdateInfo {
            public var top: Number?
            public var drawAttention: Boolean?
            public var height: Number?
            public var width: Number?
            public var state: String?
            public var focused: Boolean?
            public var left: Number?
        }
        public native trait WindowRemovedEvent : chrome.events.Event<(windowId: Number) -> Unit> {
            override fun addListener(callback: (windowId: Number) -> Unit)
        }
        public native trait WindowCreatedEvent : chrome.events.Event<(window: Window) -> Unit> {
            override fun addListener(callback: (window: Window) -> Unit)
        }
        public native trait WindowFocusChangedEvent : chrome.events.Event<(windowId: Number) -> Unit> {
            override fun addListener(callback: (windowId: Number) -> Unit)
        }
        public native var WINDOW_ID_CURRENT: Number = noImpl
        public native var WINDOW_ID_NONE: Number = noImpl
        public native fun get(windowId: Number, callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun get(windowId: Number, getInfo: GetInfo, callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun getCurrent(callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun getCurrent(getInfo: GetInfo, callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun create(createData: CreateData? = null, callback: ((window: chrome.windows.Window) -> Unit)? = null): Unit = noImpl
        public native fun getAll(callback: (windows: Array<chrome.windows.Window>) -> Unit): Unit = noImpl
        public native fun getAll(getInfo: GetInfo, callback: (windows: Array<chrome.windows.Window>) -> Unit): Unit = noImpl
        public native fun update(windowId: Number, updateInfo: UpdateInfo, callback: ((window: chrome.windows.Window) -> Unit)? = null): Unit = noImpl
        public native fun remove(windowId: Number, callback: (()->Unit)? = null): Unit = noImpl
        public native fun getLastFocused(callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native fun getLastFocused(getInfo: GetInfo, callback: (window: chrome.windows.Window) -> Unit): Unit = noImpl
        public native var onRemoved: WindowRemovedEvent = noImpl
        public native var onCreated: WindowCreatedEvent = noImpl
        public native var onFocusChanged: WindowFocusChangedEvent = noImpl
    }
}
/*
module
public object chrome.debugger {
    public trait Debuggee {
        public var tabId: Number
    }
    public trait DebuggerDetachedEvent : chrome.events.Event {
        override fun addListener(callback: (source: Debuggee) -> Unit)
    }
    public trait DebuggerEventEvent : chrome.events.Event {
        override fun addListener(callback: (source: Debuggee, method: String, params: Object? = null) -> Unit)
    }
    public fun attach(target: Debuggee, requiredVersion: String, callback: Function? = null): Unit = noImpl
    public fun detach(target: Debuggee, callback: Function? = null): Unit = noImpl
    public fun sendCommand(target: Debuggee, method: String, commandParams: Object? = null, callback: ((result: Object) -> Unit)? = null): Unit = noImpl
    public var onDetach: DebuggerDetachedEvent = noImpl
    public var onEvent: DebuggerEventEvent = noImpl
}

*/