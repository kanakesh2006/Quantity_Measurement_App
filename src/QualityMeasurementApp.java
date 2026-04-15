package com.quantitymeasurement;

        /**
         * UC3: Generic Quantity Class (DRY Principle)
         */
        public class QualityMeasurementApp {

            // -------- ENUM --------
            public enum LengthUnit {
                FEET(12.0),     // 1 foot = 12 inches
                INCHES(1.0);    // base unit = inches

                private final double conversionFactor;

                LengthUnit(double factor) {
                    this.conversionFactor = factor;
                }

                public double getConversionFactor() {
                    return conversionFactor;
                }
            }

            // -------- GENERIC LENGTH CLASS --------
            public static class Length {

                private final double value;
                private final LengthUnit unit;

                public Length(double value, LengthUnit unit) {

                    if (unit == null) {
                        throw new IllegalArgumentException("Unit cannot be null");
                    }

                    this.value = value;
                    this.unit = unit;
                }

                // Convert to base unit (inches)
                private double toBaseUnit() {
                    return this.value * this.unit.getConversionFactor();
                }

                @Override
                public boolean equals(Object obj) {

                    if (this == obj) return true;

                    if (obj == null) return false;

                    if (this.getClass() != obj.getClass()) return false;

                    Length other = (Length) obj;

                    return Double.compare(this.toBaseUnit(), other.toBaseUnit()) == 0;
                }
            }

            // -------- DEMO METHODS --------

            public static void demonstrateLengthEquality() {
                Length l1 = new Length(1.0, LengthUnit.FEET);
                Length l2 = new Length(12.0, LengthUnit.INCHES);

                System.out.println("Feet vs Inches Equal? " + l1.equals(l2));
            }

            public static void demonstrateFeetEquality() {
                Length f1 = new Length(1.0, LengthUnit.FEET);
                Length f2 = new Length(1.0, LengthUnit.FEET);

                System.out.println("Feet Equal? " + f1.equals(f2));
            }

            public static void demonstrateInchesEquality() {
                Length i1 = new Length(1.0, LengthUnit.INCHES);
                Length i2 = new Length(1.0, LengthUnit.INCHES);

                System.out.println("Inches Equal? " + i1.equals(i2));
            }

            // -------- MAIN --------
            public static void main(String[] args) {

                demonstrateFeetEquality();
                demonstrateInchesEquality();
                demonstrateLengthEquality();
            }
        }