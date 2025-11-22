package com.akzuza.panta.navigation

import androidx.compose.runtime.*
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.runtime.entryProvider
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text

@Composable
fun MainNavigation(
	modifier: Modifier = Modifier,
	backstack: List<Route>
) {
	NavbarContainer (
		selectedRoute = backstack.last()
	) { 
		NavDisplay(
			modifier = modifier,
			backStack = backstack,
			entryProvider = entryProvider { 
				entry<Route.HOME> {
					Text("HOME Route")
				}

				entry<Route.TASKS> {
					Text("TASKS Route")
				}

				entry<Route.NOTES> {
					Text("NOTES Route")
				}
			}
		)
	}
}

@Composable
expect fun NavbarContainer(selectedRoute: Route, content: @Composable () -> Unit)

