/* [표준 에너테이션]
    2. @Deprecated : 기존에 사용하던 기술이 다른 기술로 대체되어 기존 기술을 적용한 코드를 더 이상 사용하지 않도록 유도하는 경우
    - 기존 코드를 다른 코드와의 호환성문제로 삭제하기 곤란해 남겨두어야만 하지만 더 이상 사용하는 것을 권장하지 않을 때에 사용
 */


package Section1.Object.Effective.AnnotationFile;



public class Annotation_Deprecated {
    public static void main(String[] args) {
        OldClass oldclass = new OldClass();
        //System.out.println(oldclass.getOldField()); //오류 :  @Deprecated
    }
}
class OldClass {
    @Deprecated
    private int oldField = 2;


    @Deprecated
    int getOldField(){
        return oldField;
    }
}
