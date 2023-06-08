package org.example;


import com.google.protobuf.Descriptors;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import io.nonquarkus.example.GreeterGrpc;
import io.nonquarkus.example.GreeterGrpc.*;
import io.nonquarkus.example.HelloRequest;
import io.nonquarkus.example.HelloReply;

import java.util.*;
public class HelloService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, io.grpc.stub.StreamObserver<HelloReply> response){
        response.onNext(
                HelloReply.newBuilder().setMessage("Hello " + request.getName()).build()
        );
        response.onCompleted();
    }
}
