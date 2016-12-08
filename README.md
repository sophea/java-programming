# java-programming
java-programming

#Download Java JDK 1.7 or 1.8
 - JDK 1.7 : http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

 - JDK 1.8 :  http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
 
#IDE
 - Eclipse : download https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R1/eclipse-inst-win64.exe
 - STS : https://spring.io/tools/sts/all
 
For Window OS instruction see this:  
https://docs.google.com/document/d/1bGrkn_vgYZ38mxjwOyKcIxrwN5dVX_rclmBIrtooRgc/edit

# Mac OS : install both JDK  java 1.7 and 1.8 together
```sh

Install java jdk 1.7
Install java jdk.18
Open file in terminal console  : >> nano   ~/.bash_profile
Add the following lines at the bottom lines




java7() {
  export JAVA_HOME=$(/usr/libexec/java_home -v 1.7)
   echo "Using Java 7"
  java -version
}
java8() {
  export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)
 echo "Using Java 8"
  java -version
}

Save the file and run this command>> source ~/.bash_profile
After then you can switch by using java7 or java8
```


#INSTALL JAVA JDK (Linux OS)
```java

JAVA JDK 1.7.x or later 
All projects require Java 7 or later.  Install java 1.7.0_80 or most recent update of java 7. For Google App Engine it supported only java jdk 1.7.x
 
Ensure that JAVA_HOME environment variable is set and that java 7 is on your path.
Linux install instructions:
   $ sudo add-apt-repository ppa:webupd8team/java
   $ sudo apt-get update
   $ sudo apt-get install oracle-java7-installer
   $ sudo apt-get install oracle-java7-set-default
Check that JAVA_HOME is set:
   $ echo $JAVA_HOME
If JAVA_HOME is not set, add this to your ~/.bashrc:
$ export JAVA_HOME=/usr/lib/jvm/java-7-oracle
 
 
Windows and OS X install instructions:  download jdk 7 or later version from the Oracle website and install.  Set JAVA_HOME as a system environment variable.
Verify installed java version:
 
   $ java -version
   java version "1.7.0_80"
   Java(TM) SE Runtime Environment (build 1.7.0_80-b15)
   Java HotSpot(TM) 64-Bit Server VM (build 24.80-b11, mixed mode)
 
JAVA JDK 1.8.x 
 
 
$ sudo add-apt-repository ppa:webupd8team/java
$ sudo apt-get update
$ sudo apt-get install oracle-java8-installer
$ sudo apt-get install oracle-java8-set-default
  
If JAVA_HOME is not set, add this to your ~/.bashrc:
$ export JAVA_HOME=/usr/lib/jvm/java-8-oracle
 
 $ java -version
   java version "1.8.0_77"
   Java(TM) SE Runtime Environment (build 1.8.0_77-b03)
   Java HotSpot(TM) 64-Bit Server VM (build 25.77-b03, mixed mode)


Switch Java version 1.7 to 1.8
edit ~/.bashrc and add the following codes

$gedit ~/.bashrc
  
//add the following block codes to the last bottom of line
  
java8 () {
  export JAVA_HOME=/usr/lib/jvm/java-8-oracle
  export PATH=$JAVA_HOME/bin:$PATH
  echo "Using Java 8"
  java -version
}
  
java7 () {
  export JAVA_HOME=/usr/lib/jvm/java-7-oracle
  export PATH=$JAVA_HOME/bin:$PATH
  echo "Using Java 7"
  java -version
}
 $ source ~/.bashrc
# Now you can simply invoke 'javaN' in your terminal to switch JDKs.
$ java7
$ java8

```
