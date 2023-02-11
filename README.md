# Firefox Anti Shorts Extension
This is a quick and dirty Firefox extension written in Kotlin that hides YouTube shorts from your subscription feed.

### How to build
Just run `gradlew distFirefoxPlugin`.
The built zip file will be located at `build/libs/firefox-anti-shorts-extension-<version>.zip`.

### What??
This extension runs a small script on sub-pages of youtube.com/feed, that simply removes all the tiles that correspond to YouTube shorts. The result currently looks like this:
![filtered-feed.png](doc%2Ffiltered-feed.png)

The gaps in the screenshot are where the shorts were displayed before they were removed.
I would love to let the grid re-arrange itself after the tiles are removed, but this is good enough for an initial sketch. Hit me up if you know how to do that rearrangement.

### Why??
My subscription feed is getting cluttered with shorts; sometimes more than 1/3 of all feed entries are shorts. I personally don't like them, but since YouTube does not provide a setting to hide those, I wrote this small extension to give me some peace of mind.

There were also a small number of people who also wanted to have this extension, so this is why there is a git repo for it.

### How??
I am not very familiar with the KotlinJS pipeline, nor with frontend development. So I don't know either, I'm afraid. If you know what is going on and have some input on how to improve this thing, let me know in an issue or pull request. 
