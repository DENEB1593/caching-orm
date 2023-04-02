# EHCACHE

---

### 환경
- jdk 17
- springboot 3.x
- ehcache 3.x


### 참고사항
- jaxb 오류 참조: java 9 이상부터 jaxb 관련 api는 기본으로 탑재되지 않아 수동으로 지정해줘야함 <br>
https://stackoverflow.com/questions/54632086/java-11-implementation-of-jaxb-api-has-not-been-found-on-module-path-or-classpa
 
- 캐싱 대상 객체는 Serializable를 구현해줘야한다. 캐싱은 외부/내부 영역에 저장되므로 읽고/쓰기를 할 때 직렬화 과정이 필요하기 때문이다. <br>
  https://www.ehcache.org/documentation/3.0/serializers-copiers.html