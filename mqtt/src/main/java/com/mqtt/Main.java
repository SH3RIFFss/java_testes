package com.mqtt;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Main {
    public static void main(String[] args) {
        String broker,topico,clientId,user,passw;
        try {
            // broker="tcp://192.168.1.14:1883"; //id de rede local
            // topico="topico/001"; //topico local
             
            broker="ws://maqiatto.com:8883";
            topico="picadetitani1@gmail.com/topic001";
            user="picadetitani1@gmail.com";
            passw="123456";
            clientId="jv_client";
            //criando o cliente 
            MqttClient client=new MqttClient(broker, clientId);
            System.out.println("conectando ao broker : "+broker);
            //calback config
            client.setCallback(new MqttCallback() {
                //msg de perda de conexão
                @Override
                public void connectionLost(Throwable cause) {
                    System.out.println("conexao perdido. Causa : "+cause.getMessage());
                }
                //para apreesentar a msg recebida
                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    System.out.println("==========");
                    System.out.println("menssagem recebia !");
                    System.out.println("topico"+topic);
                    System.out.println("menssagem : "+new String(message.getPayload()));
                }
                //para apresentar a entrega da msg deste usuario
                @Override
                public void deliveryComplete(IMqttDeliveryToken token){
                    //logica de entrega
                }
            });

            MqttConnectOptions options=new MqttConnectOptions();
            options.setCleanSession(true);
            //adicioando altenticação
            options.setUserName(user);
            options.setPassword(passw.toCharArray());
            //conecta o cliente ao broker
            client.connect(options);
            System.out.println("conectado com sucesso !");
            //conexão com o topico
            client.subscribe(topico, 1);
            System.out.println("subescrito no topico : "+topico);
            System.out.println("agardando menssagens...");
            
        } catch (MqttException me) {
            System.out.println("erro ao conectat ou subescrever!");
            System.out.println("causa : "+me.getReasonCode());
            System.out.println("menssagem : "+me.getMessage());
        }
    }
}