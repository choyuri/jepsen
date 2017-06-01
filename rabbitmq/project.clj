(defproject jepsen.rabbitmq "0.1.0"
  :description "RabbitMQ tests for Jepsen"
  :url "https://github.com/aphyr/jepsen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
:main jepsen.rabbitmq-test
 :dependencies [[org.clojure/clojure "1.8.0"]
                 [jepsen "0.1.4"]
	         [com.novemberain/langohr "2.7.1" ] 
                 [verschlimmbesserung "0.1.3"]])
