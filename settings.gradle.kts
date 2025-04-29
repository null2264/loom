tryIncludeBuild("null-fabric-loom")
tryIncludeBuild("null-architectury-loom")

fun tryIncludeBuild(path: String) {
    if (file(path).exists()) includeBuild(path)
}

rootProject.name = "null-loom-parent"
