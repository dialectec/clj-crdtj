(def project 'clj-crdtj)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"resources" "src"}
          :source-paths   #{"test"}
          :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [adzerk/boot-test "RELEASE" :scope "test"]
                            [onetom/boot-lein-generate "0.1.3" :scope "test"]])

(task-options!
 pom {:project     project
      :version     version
      :description "FIXME: write description"
      :url         "http://example/FIXME"
      :scm         {:url "https://github.com/yourname/clj-crdtj"}
      :license     {"The Apache License, Version 2.0"
                    "http://www.apache.org/licenses/LICENSE-2.0.txt"}})

(deftask build
  "Build and install the project locally."
  []
  (comp (pom) (jar) (install)))

(require '[adzerk.boot-test :refer [test]])
(require 'boot.lein)
(boot.lein/generate)
