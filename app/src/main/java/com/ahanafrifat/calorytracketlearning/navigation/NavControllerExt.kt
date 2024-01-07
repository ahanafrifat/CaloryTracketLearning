package com.ahanafrifat.calorytracketlearning.navigation

import androidx.navigation.NavController
import com.ahanafrifat.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}