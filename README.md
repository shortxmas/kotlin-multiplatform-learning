# Resources

https://github.com/JetBrains/compose-multiplatform-desktop-template#readme

https://kotlinlang.org/docs/multiplatform-add-dependencies.html

https://www.youtube.com/watch?v=3VlJKTDdQHI&ab_channel=Stevdza-San

https://kotlinlang.org/docs/native-dynamic-libraries.html

https://github.com/AAkira/Kotlin-Multiplatform-Libraries

# Progress

- Created initial project structure through create new project with the plugin
- Was able to integrate library https://github.com/Kotlin/kotlinx-datetime
- Created a button that displays days until new year

# Findings

- Compose multiplatform desktop app plugin creates a template for your desktop app
- Main entry point for apps code is in Main.kt with a starting function main() that starts the aoo
- build.gradle.kts acts as the settings file for dependencies and resources
- In order to get dependencies to work in your project, you must sync them after adding them

- Kotlin Multiplatform and Compose multiplatform are different but similar things, compose multiplatform is built on top of kotlin multiplatform but allows sharing of business logic like kotlin multiplatform along with UI logic

