[![Build Status](https://travis-ci.org/martinlarsson/workflow-test.svg?branch=master)](https://travis-ci.org/martinlarsson/workflow-test)
# Workflow
Testing a workflow including automated tests and style checks for future courses.

## Folders
A short description of the contents of the included folders.

* `lib` - A collection of libraries: Hamcrest, JUnit and Checkstyle.
* `src` - Source code for application.
* `test` - Source code for unit tests.

## Files
A short description of the included files.

* `.gitignore` - Specifikation of which files should not be tracked by git.
* `.travis.yml` - Specifikation of what should be run on Travis CI and in what order.
* `LICENSE` - License of the source code.
* `README.md` - This file.
* `build.xml` - Ant-file with specifics for building, executing tests and running style check.
* `sun_checks.xml` - Sun Java code style rules fur checkstyle usage.

## Travis CI
This repository is using Travis CI to automatically run JUnit-tests and checkstyle. It can be monitored at [travis-ci.org/martinlarsson/workflow-test](https://travis-ci.org/martinlarsson/workflow-test).



