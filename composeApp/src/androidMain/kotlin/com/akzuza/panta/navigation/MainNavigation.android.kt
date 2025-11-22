package com.akzuza.panta.navigation

import androidx.compose.runtime.*
import com.akzuza.panta.navigation.Route

@Composable
actual fun NavbarContainer(selectedRoute: Route, content: @Composable () -> Unit) {
	// Implement android size specific resizing of content
	// and appropriate navigation ui
	//
	content.invoke()
}

