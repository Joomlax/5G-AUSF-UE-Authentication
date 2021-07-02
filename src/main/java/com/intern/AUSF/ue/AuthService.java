package com.intern.AUSF.ue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {
    public List<Auth> getAuth() {
        return List.of(
                new Auth(
                        "supi",
                        "snn",
                        new ResynchronizationInfo(
                                "rand",
                                "auths"
                        ),
                        new TraceData(
                                "traceRef",
                                "traceDepth",
                                "neTypeList",
                                "eventList",
                                "CE4",
                                "CE6"
                        ),
                        "udmGroupId"

                )

        );
    }
}
