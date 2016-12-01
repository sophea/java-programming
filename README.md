# java-programming
java-programming

#Download Java JDK 1.7 or 1.8
 - JDK 1.7 
 - JDK 1.8
 
#IDE
 - Eclipse : download http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/junor
 - STS : https://spring.io/tools/sts/all
 
 
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
