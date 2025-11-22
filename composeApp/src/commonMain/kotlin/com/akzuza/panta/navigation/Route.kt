package com.akzuza.panta.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Route (
	val route: String,
	val label: String,
) {
	@Serializable
	data object HOME: Route("home", "Home")
	
	@Serializable
	data object NOTES: Route("notes", "Notes")

	@Serializable
	data object TASKS: Route("tasks", "Tasks")
}
