package com.istudio.solid_principles.main.selection
sealed class ModuleDemo(val rout: String) {

    data object DemoSelection : ModuleDemo("DemoSelection")
    data object SingleResponsibilityPrincipleDemo : ModuleDemo("SingleResponsibilityPrincipleDemo")
    data object OpenClosedPrincipleDemo : ModuleDemo("OpenClosedPrincipleDemo")
    data object LiskovSubstitutionPrincipleDemo : ModuleDemo("LiskovSubstitutionPrincipleDemo")
    data object InterfaceSegrigationPrincipleDemo : ModuleDemo("InterfaceSegrigationPrincipleDemo")
    data object DepenedencyInversionPrincipleDemo : ModuleDemo("DepenedencyInversionPrincipleDemo")

}