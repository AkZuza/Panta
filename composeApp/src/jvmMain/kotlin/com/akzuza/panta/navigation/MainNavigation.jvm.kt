package com.akzuza.panta.navigation

import androidx.compose.runtime.*
import androidx.compose.material3.NavigationRail
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.akzuza.panta.navigation.Route

@Composable
actual fun NavbarContainer(selectedRoute: Route, content: @Composable () -> Unit) {
	Row (modifier = Modifier.fillMaxSize()) {
		NavigationRail() {  }
		content.invoke()
	}
}
