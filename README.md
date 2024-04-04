# epicchainjdk: A Java/Kotlin/Android Development Toolkit for the EpicChain Blockchain

epicchainjdk is a development toolkit that provides easy and reliable tools to build EpicChain dApps and Smart Contracts using the Java platform (Java, Kotlin, Android). It is an open-source project developed by the community and maintained by [AxLabs](https://axlabs.com).



# Quickstart

epicchainjdk is composed of an **SDK** for dApp development and a **devpack** for smart contract development -- which also includes a **compiler** (JVM to EpicChainVM). The following sections describe how to get started with them! :rocket:

## SDK

To make use of all epicchainjdk SDK features, add `io.epicchainjdk:contract` to your dependencies.

__Gradle__

```groovy
implementation 'io.epicchainjdk:contract:3.19.3'
```

__Maven__

```xml
<dependency>
    <groupId>io.epicchainjdk</groupId>
    <artifactId>contract</artifactId>
    <version>1.0.1</version>
</dependency>
```



## Devpack/Compiler

For smart contract development, you need the `io.epicchainjdk:devpack` dependency. It provides all EpicChian-related utilities to write your first smart contract on the EpicChain blockchain!

Then, add the following dependency to your project.

__Gradle__

```groovy
implementation 'io.epicchainjdk:devpack:3.19.3'
```

__Maven__

```xml
<dependency>
    <groupId>io.epicchainjdk</groupId>
    <artifactId>devpack</artifactId>
    <version>3.19.3</version>
</dependency>
```