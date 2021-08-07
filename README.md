<h1 align="center">Simple MVVM Unsplash App</h1>
<p align="center">
A simple Unsplash Image Gallery app based on MVVM architecture.<br>
<i>Re-upload of the old project for demonstration purpose.
  It was a part of my process of learning Modern Android Development.
  This project has reached its end of life.</i>
</p>

<p align="center">
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <a href="https://github.com/boy12hoody/SimpleMVVMUnsplashApp/actions/workflows/android.yml"><img alt="GitHub Workflow Status" src="https://img.shields.io/github/workflow/status/boy12hoody/SimpleMVVMUnsplashApp/Build%20&%20Publish%20Debug%20APK"></a>
  <a href="https://github.com/boy12hoody/SimpleMVVMUnsplashApp/blob/main/LICENSE"><img alt="License" src="https://img.shields.io/github/license/boy12hoody/SimpleMVVMUnsplashApp"></a>
  <a href="https://t.me/boywonder"><img alt="Telegram" src="https://img.shields.io/badge/Telegram-@BoyWonder-blue.svg?style=flat&logo=telegram"/></a>
</p>

### Screenshots
<p align="center">
<img src="https://user-images.githubusercontent.com/70273198/128592938-6842f9da-7d35-4000-a19b-5582fd44f858.jpg" width="30%"/>
<img src="https://user-images.githubusercontent.com/70273198/128592939-fe118206-9e8f-4299-b722-723b725866ac.jpg" width="30%"/>
<img src="https://user-images.githubusercontent.com/70273198/128592940-74b19725-46dd-4515-afee-85bdbf0e7454.jpg" width="30%"/>
<img src="/preview/preview.gif" width="30%"/>
</p>

## Download
Go to the [Releases](https://github.com/boy12hoody/SimpleMVVMUnsplashApp/releases) to download the latest APK (Demo Api Key included).

## Build And Run

1. Get a free API Key at [Unsplash.com](https://unsplash.com/developers)
2. Clone the repo
   ```sh
   git clone https://github.com/boy12hoody/SimpleMVVMUnsplashApp.git
   ```
3. From Android Studio, select *Import Project*, then select the root folder of the cloned repository.
4. Click *Make Project* to build the app and download all the required dependencies.
5. Replace your API key in `api/UnsplashApi`
   ```JS
   const val CLIENT_ID = "Paste_Your_Key_Here"
   ```
6. Click *Run app* to install the app on your device or emulator.


## 🛠 Tech stack & Open-source libraries
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Retrofit 2](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM.
- [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling.
- [Unsplash API](https://unsplash.com/developers) - JSON API to work with the largest open collection of high-quality photos.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
    - [Jetpack](https://developer.android.com/jetpack) -
        - [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - the library helps us load and display pages of data from a larger dataset from local storage or over network.
        - [Navigation](https://developer.android.com/guide/navigation) - Navigation component designed for apps that have one main activity with multiple fragment destinations.
        - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
        - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
        - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) -
    - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
    - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Material Components for Android](https://material.io/develop/android/docs/getting-started/) - Modular and customizable Material Design UI components for Android.

## Architecture
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.
![](https://user-images.githubusercontent.com/70273198/128593523-b396cb17-278f-4f94-b240-3d9918b18a9a.png)


## Contact
If you have questions or need any help, contact me on
[![Telegram](https://img.shields.io/badge/Telegram-@BoyWonder-blue.svg?style=flat&logo=telegram)](https://t.me/boywonder)

# License
```
MIT License

    Copyright (c) 2021 Ismatov Xurshid

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
```
