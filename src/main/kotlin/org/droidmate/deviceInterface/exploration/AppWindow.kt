package org.droidmate.deviceInterface.exploration

import java.io.Serializable

/** meta information of currently displayed windows */
data class AppWindow(
        val windowId: Int,
        val pkgName: String,

        /** for these two Focus properties we have yet to check which ones are keyboard only and which indicate appWindow focus*/

        val hasInputFocus: Boolean,
        /** has accessibility focus */
        val hasFocus: Boolean,

        /** This is the 'overall' boundary of this window however it may be (partially) hidden by other windows.
         * These overlays are considered within the UiElement-Visibility computation but cannot currently be reconstructed on client side
         * since system windows are already removed from the extracted data
         */
        val boundaries: Rectangle,

        /**
         * the size of the screen (width,height) as the app window may only be a part of the overall screen
         * but this information may be necessary to determine background-views of system elements)
         */
        val screenSize: Pair<Int, Int>
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = -686914223 // this is "AppWindow".hashCode but it only has to be unique
    }
}