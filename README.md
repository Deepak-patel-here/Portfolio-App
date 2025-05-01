
# Portfolio App

This is a **Portfolio App** built using **Jetpack Compose**, which showcases different sections including **About Me**, **Projects**,**Contact** and the **Home Screen**. The app utilizes modern Android development practices, including **Navigation** for seamless screen transitions, **State Management**, and **Material 3 Design** for a polished and user-friendly UI.

---

## Features

- **Home Screen**: The main landing page of the app, providing quick access to different sections of the portfolio.
- **About Me**: A dedicated screen to introduce the app owner with details like biography, skills, and more.
- **Projects**: A showcase of projects built by the app owner with detailed descriptions and possibly media related to the projects.
- **Contact** : This helps user to contact with me.
- **Navigation**: The app implements navigation to move between different sections using Jetpack Compose’s `NavHost` and `NavController`.
- **Dark/Light Mode**: Supports toggling between dark and light themes based on user preference.
- **Bottom Sheet**: A modal bottom sheet is included for quick navigation to different sections.
- **Responsive UI**: The app is designed to be responsive with Jetpack Compose, adjusting to different screen sizes and orientations.

---

## Screenshots
![IMG-20250501-WA0009](https://github.com/user-attachments/assets/6850cd9e-d748-49e2-ab1b-2bc158e43391) ![IMG-20250501-WA0008](https://github.com/user-attachments/assets/cc56840e-9f71-4906-95d9-324dcfaa5569)


![IMG-20250501-WA0010](https://github.com/user-attachments/assets/d2ce61ae-e937-484b-94cd-e05933e566ac) ![IMG-20250501-WA0011](https://github.com/user-attachments/assets/e1c5b074-5318-47b9-a767-ab26252ab80a)


---

## Technologies Used

- **Jetpack Compose**: For building the user interface in a declarative way.
- **Kotlin**: The language used for Android development.
- **Navigation**: For handling navigation and transitions between different screens in the app.
- **Material 3**: Provides the UI components and design system to follow modern Android design patterns.


---

## Setup Instructions

To run this app on your local machine, follow these steps:

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/portfolio-app.git
```

### 2. Open the Project in Android Studio

- Open Android Studio.
- Select **Open an existing project** and navigate to the cloned project directory.
- Once opened, wait for Android Studio to download necessary dependencies.

### 3. Run the Application

- Click on the **Run** button in Android Studio or use the keyboard shortcut **Shift + F10**.
- Choose an emulator or a connected device to run the app.

---

## App Structure

### 1. **Navigation**

The app uses **Jetpack Navigation** for screen management. The navigation flow is handled by a `NavController` which allows users to switch between different sections like **Home**, **About Me**, and **Projects**.

```kotlin
NavHost(navController = navController, startDestination = NavigationDestination.Home.route ) {
    composable(route = NavigationDestination.Home.route) {
        MainScreen()
    }
    composable(route = NavigationDestination.About.route) {
        AboutMeScreen()
    }
    composable(route = NavigationDestination.Projects.route) {
        ProjectScreen()
    }
}
```

### 2. **UI Design**

The UI is built using **Jetpack Compose** and follows the **Material 3** design guidelines for a modern and clean look. 

- **TopBar**: Custom top bar that displays the title of the app and a button for toggling between light/dark mode.
- **ModalBottomSheet**: A bottom sheet is used for quick navigation between different sections like **Home**, **About**, and **Projects**.
  
```kotlin
Scaffold(
    topBar = { TopBar(modifier = Modifier.statusBarsPadding()) }
) { paddingValues ->
    ModalBottomSheet(
        onDismissRequest = { showSheet = false },
        sheetState = sheetState,
        modifier = Modifier.padding(paddingValues)
    ) {
        // Navigation content here
    }
}
```

### 3. **Dark Mode**

The app supports **dark and light themes**, and users can toggle between them using a **state variable** that tracks the current theme. The system UI (status bar) color also changes accordingly based on the selected theme.

```kotlin
val systemUiController = rememberSystemUiController()
systemUiController.setSystemBarsColor(
    color = MaterialTheme.colorScheme.surfaceContainerLow,
    darkIcons = !isDark.value
)
```

---

## Key Features

### **Resume Download**

The app features a **download button** that allows users to download the app owner’s resume. The download is initiated using the `DownloadManager` to download the file to the device's external storage.

```kotlin
val request = DownloadManager.Request(Uri.parse(fileUrl))
    .setTitle("Downloading Resume")
    .setDescription("Your resume is being downloaded")
    .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "my_resume.pdf")
    .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
downloadManager.enqueue(request)
```

---

## Contribution

Contributions to the app are welcome! If you would like to contribute, please follow the steps below:

1. Fork the repository.
2. Clone your fork to your local machine.
3. Create a new branch with a descriptive name.
4. Implement your changes and commit them.
5. Push your changes back to your forked repository.
6. Submit a pull request.

---


## Contact

You can reach the creator of this app at([https://www.linkedin.com/in/deepak-patel-555671282/]).

##Demo Video

you can take a look of the demo video of this portfolio app ([https://drive.google.com/file/d/18TOXmU2CfTh2L1R7ezVTZm30TG27z73A/view?usp=sharing])

## APK

You can download the apk of my app by follow this link : ([https://drive.google.com/file/d/1P35npMIi7ZEBJ5RA1yO_FU2O7ugVUbfb/view?usp=sharing])
