plugins {
    kotlin("jvm") version "2.0.21"
}

// Replace with your own information
group = "gg.departed"
version = "0.0.1"

typewriter {
    namespace = "Departed MMORPG"

    extension {
        name = "DepartedMMORPGExtension"
        shortDescription = "An extension that contains quality of life features"
        description = "Quality of life features for Typewriter"
        engineVersion = "0.8.0"

        // paper {
            // Optional - If you want to make sure a plugin is required to be installed to use this extension
        //    dependency("<plugin name>")
        //}
    }
}

kotlin {
    jvmToolchain(21)
}