package com.akzuza.panta

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.akzuza.panta.navigation.Route
import com.akzuza.panta.navigation.MainNavigation
import kotlin.properties.ReadOnlyProperty.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun App() {
    MaterialTheme {
		val backstack = remember { mutableStateListOf<Route>(Route.HOME) }
		MainNavigation(modifier = Modifier.fillMaxSize(), backstack = backstack)
    }
}
