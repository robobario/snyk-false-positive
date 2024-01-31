# false positive

This is to demonstrate that filling an array using a SecureRandom causes snyk code to flag it as a hardcoded initialisation array: SNYK-CODE CWE-547

Failing code:

```java
public static void main(String[] args) {
    byte[] bytes = new byte[12];
    new SecureRandom().nextBytes(bytes);
    new GCMParameterSpec(32, bytes);
}
```

Snky output
```
snyk code test

Testing /home/roby/snyk-false-positive ...

 ✗ [High] Hardcoded Secret 
   Path: Example.java, line 9 
   Info: Hardcoded value array {...} is used as a cipher initialization value. Generate the value with a cryptographically strong random number generator such as java.security.SecureRandom instead.


✔ Test completed

Organization:      application-services-amq-streams
Test type:         Static code analysis
Project path:      /home/roby/snyk-false-positive

Summary:

  1 Code issues found
  1 [High] 
```
