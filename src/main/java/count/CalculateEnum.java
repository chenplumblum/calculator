package count;



public enum CalculateEnum{

    lhs_spu_id("lhs_spu_id","lhsSpuId");

    private final String originalValue;
    private final String returnValue;

    CalculateEnum(String originalValue, String returnValue) {
        this.originalValue = originalValue;
        this.returnValue = returnValue;
    }

}
