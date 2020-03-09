# ProcessLifecycleDemo

This is a demo project that includes some examples about Android Activity lifecycle & handling its state.

The `master` branch contains the erroneous cases, whereas the `solutions` branch shows the solutions to handle state.

The project has a "main" screen that directs to example cases. Within each screen you can play around by

1. Changing the screen to landscape and back to portrait (triggers a configuration change)
2. Sending the app to the background and then killing the application process
3. Turning on "Don't keep activities" from Settings > Developer Options on your phone, and toggling the app to background/foreground

## Examples

For each example below, simply start with checking out the `master` branch to see what does **not** work. Then check out the `solutions` branch and try out same scenario. Observe that the problem's gone. 

### Simple Variable

Increment the value of number "x" by pressing the button. Observe that the value is not preserved in any of the cases (1), (2) and (3).

_Solution:_ The value is preserved since it's store in a bundle in `onSaveInstanceState()` and restored from the bundle in `onCreate()`

### Widget With Id

Type something in the EditText in the screen. Try out cases (1), (2), (3) and check whether the value is preserved.

_Solution:_ Check out the xml layout of the activity (activity_edittext.xml) and compare "master" and "solutions" branches. The value is preserved in "solutions" branch by simply adding `android:id` to the EditText.

### ViewModel

Increment the value of number "numberLiveData" stored in the ViewModel by pressing the button. Observe that the value is preserved in configuration change, but not when the process is killed.

_Solution for this case has not been implemented yet. You can store the ViewModel's state by using [ViewModel SavedState](https://developer.android.com/topic/libraries/architecture/viewmodel-savedstate)._

### Fragment Arguments

Type anything in the first screen, and then move onto the second screen by pressing the button. You should see the text you have typed in a Toast message. Now, when on the second screen, try out cases (1), (2) and (3). Try to bring back the app to foreground. You must see a crash due to InstantiationException.

_Solution:_ Android needs a no-arg constructor of the fragments to be able to re-create it itself. If you want to pass any arguments to a Fragment, you should do it via "arguments" bundle. The problem is fixed by using this bundle.

 