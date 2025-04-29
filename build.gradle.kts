plugins {
    id("ca.stellardrift.gitpatcher") version "1.1.0"
}

val loom = (project.properties["loom.variants"] as? String ?: "").split(",").map(String::trim)

gitPatcher.patchedRepos {
    if ("fabric" in loom) {
        register("fabricLoom") {
            submodule = "upstreams/fabric-loom"
            target = file("fabric-loom")
            patches = file("patches/fabric-loom")
        }
    }
    if ("architectury" in loom) {
        register("architecturyLoom") {
            submodule = "upstreams/architectury-loom"
            target = file("architectury-loom")
            patches = file("patches/architectury-loom")
        }
    }
}
