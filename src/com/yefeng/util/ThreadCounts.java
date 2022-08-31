package com.yefeng.util;

public enum ThreadCounts {
    Ten {
        public Integer getCounts() {
            return 10;
        }
    },
    twenty {
        public Integer getCounts() {
            return 20;
        }
    },
    thirty {
        public Integer getCounts() {
            return 30;
        }
    },
    Fifty {
        public Integer getCounts() {
            return 50;
        }
    },
    Hundred {
        public Integer getCounts() {
            return 100;
        }
    };

    public abstract Integer getCounts();
}
