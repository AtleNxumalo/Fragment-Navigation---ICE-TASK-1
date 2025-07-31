# Fragment-Navigation---ICE-TASK-1
This Android application demonstrates the use of **fragments** in a modern Android project using **Kotlin**, with a focus on:
- UI composition using `CardView`, `ImageView`, and `TextView`
- Navigation between fragments using the `FragmentManager`
- Clean layout structuring with `LinearLayout`
- Material Design components and proper resource management

---

## 📌 Features

- Two-part UI using vertically split `CardView`s
- Image and text layout within each card
- Navigation between fragments via button click
- Lifecycle-aware UI setup using `onViewCreated`
- Use of `strings.xml` for clean localization and resource management
- Modular project structure with best practices for XML and Kotlin separation

---

## 🚀 Tech Stack

- **Kotlin**
- **AndroidX Fragment KTX**
- **Material Components**
- **Gradle Kotlin DSL (`build.gradle.kts`)**

---

## 📁 Project Structure

```

/app
├── java/com.example.fragmentexample
│   ├── MainActivity.kt
│   ├── YoungJusticeFragment.kt
│   └── FragmentB.kt
└── res/
├── layout/
│   ├── activity\_main.xml
│   ├── fragment\_young\_justice.xml
│   └── fragment\_b.xml
└── values/
└── strings.xml

````

---

## 🛠️ Dependencies

```kotlin
// Module-level build.gradle.kts

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.fragment:fragment-ktx:1.6.2")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
````

---

## 💡 How It Works

1. `MainActivity` loads the first fragment (`YoungJusticeFragment`) by default.
2. `YoungJusticeFragment` inflates a layout with a button and image/text cards.
3. Button click triggers a `FragmentTransaction` to load `FragmentB`.
4. `FragmentB` displays a simple message or UI.

---

## ✅ Setup

1. Clone the repo:

   ```bash
   git clone [https://github.com/yourusername/fragment-navigation-example.git](https://github.com/AtleNxumalo/Fragment-Navigation---ICE-TASK-1)]
   ```

2. Open in **Android Studio**.

3. Sync Gradle.

4. Run on emulator or physical device (API 21+).

---

## 🔄 Future Enhancements

* Considering replacing static images with dynamic content from a remote API.
* Implementing shared element transitions between fragments.
* Adding ViewModel + LiveData for data management.

---
