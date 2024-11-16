# Spring Boot JSON Deserialization And Polymorphism for MongoDb

Spring Boot uses the Jackson library for JSON serialization and deserialization. Jackson is a strong, high-performance, feature-rich library that can convert objects to and from JSON.


__This documentation is for spring boot & data-mongodb 2.5.6 version.__

## What is Serialization and Deserialization?

Serialization is the process of converting an object’s state to a byte stream, which can then be persisted into a disk or sent over the network. Conversely, deserialization is the process of converting a byte stream back into an original object.


## Polymorphic deserialization for request body and mongodb

In an object oriented programming language like Java, it is common to use inheritance. A feature of inheritance is that a class can take different forms (a class that extends another class). This phenomenon is called polymorphism.
For polymorphism deserialization in request body, you can use Jackson Annotations.(you can read in source code comments.)

For polymorphism deserialization from mongodb documents,

- You must use @Document annotations for all subtype of superclass.  If you use @Document for all subclasses, MongoMappingContext will be scan all of subclasses for successfully deserialization.

- You must use @TypeAlias annotation, If you have _class field in mongodb documents. @TypeAlias value must be equal _class value.


## Run Locally

Clone the project

```bash
  git clone https://link-to-project
```

Install dependencies

```bash
  mongodb 6.x
```

```bash
  java 11
```