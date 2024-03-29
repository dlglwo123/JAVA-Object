/*
    [메타 애너테이션]
    - 애너테이션을 정의하는 데에 사용되는 애너테이션
    - 애너테이션을 정리할 때에는 @interface 키워드를 사용하여 정의한다.

    1. @Target : 애너테이션을 적용할 대상을 지정하는데 사용
    2. @Documented : 애너테이션에 대한 정보가 Javadoc으로 작성한 문서에 포함되도록 하는 애너테이션 설정
    3. @Inherited : 하위클래스가 애너테이션을 상속받도록 한다. 상위클래스에 애너테이션을 붙이면 상속받는 하위클래스도 사용가능.
    4. @Retention : 애너테이션 지속기간
    5. @Repeatable : 애너테이션을 여러 번 붙일 수 있도록 허용한다는 의미
    (같은 이름의 애너테이션이 여러번 적용될 수 있기 때문에 애너테이션들을 하나로 묶어주는 애너테이션 별도 작성)
 */

