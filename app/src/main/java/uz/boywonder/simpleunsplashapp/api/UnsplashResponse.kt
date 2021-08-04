package uz.boywonder.simpleunsplashapp.api

import uz.boywonder.simpleunsplashapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)