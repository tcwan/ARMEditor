# ARMEditor
Version 1.0.0.201606031414

This software was originally developed by Kow Jia Poh as a Final Year Project in the School of Computer Sciences, Universiti Sains Malaysia, 11800 USM, Penang, Malaysia

ARMEditor supports the development of ARM Assembly Language in Eclipse IDE 
with additonal features like syntax highlighting, instruction template and hover info.

The existing Eclipse Assembly Editor does not support such features and only supports partial C preprocessor syntax highlighting.

# Pre-built Eclipse Plugins
The current version (1.0.0.201606031414) recognizes the ARMv4T instruction opcodes. 
ARMv5 or later instructions may not be recognized. 

Pre-built Eclipse Plugins are available for the Mars release and has not been tested on other releases.

Instructions for installation of the Pre-built Eclipse Plugins are found in the Eclipse-Plugins subdirectory

* Note: Mac OS X 10.11 (El Capitan) will trigger a Application is Damaged Issue when the plugin is installed.
Please read the Installation notes for workarounds.

# WARNING
The DSL in this version does not build with the latest Xtext versions.
You can recreate the plugins but trying to build the Xtext grammar from scratch will result in Xtext getting stuck indefinitely.
