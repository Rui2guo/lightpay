package lightpay.controller.payment;

import java.util.List;

import lombok.Data;

@Data
public class SendPaymentRes {

    private String paymentError;

    private String paymentPreimage;

    private Route paymentRoute;

    @Data
    public static class Route {

        private Integer totalTimeLock;

        private Long totalFeesMsat;

        private Long totalAmtMsat;

        private List<Hop> hops;

        @Data
        public static class Hop {

            private Long chanId;

            private Long chanCapacity;

            private Long amtToForwardMsat;

            private Long feeMsat;

            private Integer expiry;

        }

    }

}
