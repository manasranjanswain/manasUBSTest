# Pull Request Template
  
| Sprint No       |               |            
|:----------------|--------------:|
| JIRA ID         |               |       
| Developer Name  |               |
| Date of Review  |   05/01/2023  |
| Reviewer Name   |               |
  

  
## Description

Please include a summary of the change and which issue is fixed.  List any dependencies that are required for this change.

Fixes # (issue)

## Type of change

Please delete options that are not relevant.

- [ ] Bug fix (non-breaking change which fixes an issue)
- [ ] New feature (non-breaking change which adds functionality)
- [ ] Breaking change (fix or feature that would cause existing functionality to not work as expected)
- [ ] This change requires a documentation update


## Checklist:
| S.No | Description                                                                                                                | Developer's check(✔️/✖️) | Reviewer's check(✔️/✖️) |
|:----:|----------------------------------------------------------------------------------------------------------------------------|:---------------------:|:--------------------:|
|   1  | No unnecessary imports?                                                                                                    |      ✔️             |   ✖️      |
|   2  | Proper Code comments inserted? Comments at class and  method level used? Proper Indentation of code?                       |      ✔️             |   ✔️                  |
|   3  | Loggers used?                                                                                                              |      ✔️             |   ✔️                |
|   4  | Any unused objects removed? Exception handling with code clean-up addressed?                                               |      ✔️             |   ✔️                |
|   5  | Code Quality checked using Spot bugs,Checkstyle, Pmd,SonarLint as applicable                                               |      ✔️             |   ✔️                 |
|   6  | Design Patterns used efficiently e.g.: Factory Pattern, Builder Pattern,Strategy pattern,Decorator pattern,Adapter pattern |      ✔️             |   ✔️                |
|   7  | Naming conventions followed?  https://www.oracle.com/java/technologies/javase/codeconventions- namingconventions.html      |      ✔️             |   ✖️                 |
|   8  | Real-world names for domain objects Used?  (which should represent an object in the real world).                           |      ✔️             |   ✖️                |
|   9  | Not more than one responsibility into a single class  or function, (to be refactored into separate classes and functions). |      ✔️             |   ✔️                 |
|  10  | Test Coverage (Test Class & Test Case Naming,  Preconditions focus, Assertions, follow TDD methodology)                    |      ✔️             |   ✔️                 |
|  11  | Code format and Code clean is done before check in code to GIT.                                                            |      ✔️             |   ✔️                 |
|  12  | Standard PSA project structure followed.                                                                                   |      ✔️             |   ✔️                 |
|  13  | private, protected data members/ methods used?                                                                             |      ✔️             |   ✔️                |
|  14  | Abstract methods and interfaces used?                                                                                      |      ✔️             |   ✔️                 |
|  15  | No hard coding used for constants/configuration values.                                                                    |      ✔️             |    ✔️                 |
|  16  | Any unreachable code is removed before check-in to git.                                                                    |      ✔️             |    ✔️                 |
|  17  | No unnecessary new packages created.                                                                                       |      ✔️             |    ✔️               |
|  18  | Every class and method, implemented with supported test class.                                                             |      ✔️             |    ✔️                |
|  19  | Classe names should start with uppercase letter,Method names should be camelCase and package names start will small letter. |     ✔️             |    ✔️                  |
|  20  | Similar values grouped under an enumeration (Enum).                                                                        |      ✔️             |    ✔️                  |
|  21  | No unnecessary, multiple if/else blocks.                                                                                   |      ✔️             |    ✔️                  |
|  22  | Framework features, used, wherever possible instead of writing custom code.                                                |      ✔️             |    ✔️                 |
|  23  | http codes are proper?                                                                                                     |      ✔️             |    ✔️                |
|  24  | No hard coded username/password or any security credentials in code?                                                       |      ✔️             |     ✔️                |
|  25  | Seed stack provided annotations used?                                                                                      |      ✔️             |     ✔️                |

##### PS:
+ The above checklist has been produced based on the guidelines at https://development.psa-cloud.com.
+ Some Inputs have been taken from the best practices document MPH_RT_PATRIC_VDP_BEST_PRACTICES.pdf shared by Faycel ABIDI
