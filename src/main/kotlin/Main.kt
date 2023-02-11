import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.asList

fun main() {
    console.log("registering timer for youtube shorts filter...")
    runLater()
}

private fun runLater() {
    window.setTimeout(
        handler = { run() },
        timeout = 2000,
    )
}

fun run() {
    val body = document.body
    if (body == null) {
        console.warn("body is null. cannot search for youtube tiles!")
        return
    }
    var n = 0
    for (element in body.getElementsByClassName("ytd-grid-video-renderer").asList()) {
        if ("overlay-style=\"SHORTS\"" in element.innerHTML) {
            element.remove()
            n++
        }
    }
    if (n > 0) console.log("removed $n youtube shorts cells")
    runLater()
}
