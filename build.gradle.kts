
plugins {
    base
    `maven-publish`
}

group = "com.github.gowthambharathn"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.gowthambharathn"
            artifactId = "AndroidNeuralEngine"
            version = "1.0.0"

            artifact(file("production-library-release.aar"))

            pom {
                name.set("NeuralEngine")
                description.set(
                    "Reusable Android UI components and utilities"
                )

                url.set(
                    "https://github.com/gowthambharathn/AndroidNeuralEngine"
                )
            }
        }
    }
}
