package base

import kotlin.coroutines.CoroutineContext

expect val defaultDispatcher: CoroutineContext
expect val uiDispatcher: CoroutineContext