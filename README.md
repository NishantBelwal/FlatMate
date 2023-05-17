# FlatMate


## Technical Details

- **100% Jetpack Compose** 🚀

- **Material Design 3** 💎

- **Multimodule Clean Architecture** [Clean Architecture Compose Concept](https://github.com/davidepanidev/android-multimodule-architecture-concepts/tree/clean-architecture-compose-concept) which consists of 4 separate modules:
  -  _app_: Android module that contains the Android Application component and all the framework specific configurations. It has visibility over all the other modules and defines the global dependency injection configurations.
  -  _presentation_: Android module **MVVM**-based. It contains the Android UI framework components (Activities, Composables, ViewModels...) and the related resources (e.g. images, strings...). This module just observes data coming from the undelying modules through Kotlin Flows and displays it. 
  -  _domain_: Kotlin module that contains Use Cases (platform-independent business logic), the Entities (platform-independent business models) and the Repository interfaces. It contains the `BaseAutomaticRefreshDataFlowUseCase` which handles the logic to refresh the persisted data when it becomes outdated.
  -  _data_: Android module that acts as the **Single-Source-Of-Truth (SSOT)** of the App. It contains Repositories implementation, the Room Entities for persistence, the data source Api implementations and the corresponding api-specific models.
  
- **Unit Testing** ⚙️ of the domain logic using MockK, Strickt and Turbine to test Kotlin Flows.

