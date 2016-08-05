import hudson.model.*;
import jenkins.model.*;

println "No executors on Master"
Jenkins.instance.setNumExecutors(0)
