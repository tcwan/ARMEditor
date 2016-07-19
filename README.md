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

** Note2: Mac OS X El Capitan 10.11.6 seems to have resolved this issue and will allow launching without disabling Gatekeeper.

# WARNING
The DSL in this version does not build with the latest Xtext versions.
You can recreate the plugins but trying to build the Xtext grammar from scratch will result in Xtext getting stuck indefinitely.

Note:
The working version of the ARMEditor plugin was generated using Xtext 2.8.3.v201506010551 in Eclipse Mars Release 4.5.0 on Ubuntu Linux 14.04.3 LTS
However, it does not appear to build in Xtext 2.10.0.v201605250459 on Eclipse Mars.2 on Mac OS X.

To regenerate the source code, run the GenerateARM.mwe2 in org.xtext.arm using "Run As... MWE2 Workflow".
(in Mars.2 Xtext 2.10.0, it will hang on the line below:
36759 [main] INFO  clipse.emf.mwe.utils.GenModelHelper  - Registered GenModel 'http://www.xtext.org/ARM' from 'platform:/resource/org.xtext.arm/model/generated/ARM.genmodel'

To run the plugin (without regenerating the source code) in a test Eclipse environment,
Open the org.xtext.arm.ui plugin.xml file, and in the Overview tab Testing section, Lauch an Eclipse Application.

To build the plugins, open the org.xtext.arm.ui plugin.xml file, and in the Overview tab,
follow each step in the Exporting section to generate the plugins. You will need to generate the org.xtext.arm, and org.xtext.arm.ui plugin files.

