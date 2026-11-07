plugins {
    // 로컬에 맞는 JDK(toolchain)가 없으면 Gradle 이 자동으로 내려받는다
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "springboot-sns-sample"
