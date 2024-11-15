# Real Todo List

A simple and efficient Android todo list application that allows users to add and remove tasks with persistent storage.

## Features

- Add new tasks with a simple interface
- Remove tasks by tapping on them
- Persistent storage (tasks remain after app restart)
- Clean and intuitive UI
- Supports Android 4.0.3 (API 15) and above

## Technical Details

The app is built using:
- Android SDK 28
- Java
- AndroidX Support Libraries
- Gradle build system

Key components:
- File-based data persistence using Java serialization
- ListView with ArrayAdapter for task display
- Linear layout for responsive UI

## Project Structure

The main components of the app are:

### MainActivity
The main activity handles user interactions and displays the todo list interface. It implements:
- Task addition through EditText and Button
- Task removal through ListView item clicks
- List management using ArrayAdapter

### File Storage
The File class manages data persistence:
- Saves todo items to internal storage
- Loads saved items on app startup
- Uses Java serialization for data storage

## Building the Project

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Build and run on an emulator or physical device

## Dependencies

```gradle
implementation 'com.android.support:appcompat-v7:28.0.0'
implementation 'com.android.support.constraint:constraint-layout:1.1.3'
```

