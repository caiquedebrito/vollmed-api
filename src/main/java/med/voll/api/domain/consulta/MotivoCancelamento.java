package med.voll.api.domain.consulta;

public enum MotivoCancelamento {
    PACIENTE_DESISTIU,
    MEDICO_CANCELOU,
    OUTROS;
//
//    private String motivo;
//
//    MotivoCancelamento(String motivo) {
//        this.motivo = motivo;
//    }
//
//    public static MotivoCancelamento fromString(String motivo) {
//        System.out.println(MotivoCancelamento.values());
//        for (MotivoCancelamento motivoCancelamento : MotivoCancelamento.values()) {
//            if (motivoCancelamento.motivo.equals(motivo)) {
//                return motivoCancelamento;
//            }
//        }
//
//        return MotivoCancelamento.OUTROS;
//    }
}
