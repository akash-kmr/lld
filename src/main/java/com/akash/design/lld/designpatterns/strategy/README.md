### Strategy Design Pattern

When two or more child classses have same functionalities, implementing those methods in each of them will create lot of duplicate code. So strategy design pattern is use.

In this example, PassangerVehicle use normal drive but Sports and Offroad Vehicle both use the same Special drive. So we create a Drive strategy and pass down the strategy via constuctor injection
  
![Strategy Design Pattern](https://github.com/akash-kmr/lld/assets/27440899/09f2f03c-a0e0-44ad-a5d4-12f1de299ccd)
