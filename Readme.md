### Coding Guidelines

<b>1.</b> No values should be hardcoded in application yaml file.</br>
<b>2.</b> No DB change should be done without script and scripts should be available in codebase.</br>
<b>3.</b> No one should update common code modules such as ms-common,genie-auth-util until discussed and impact of change analyzed.</br>
<b>4.</b> All POJO,Entity,Beans,DTO's should be serializable.</br>
<b>5.</b> Log service URL while calling any internal service using feign client.</br>
<b>6.</b> If service is already on production database/schema migration process should be followed on dev and uat first before moving  to production.Don't delete existing structure because this can not be done on prod.</br>
<b>7.</b> Use lombok instead of writing code manually wherever possible.</br>
<b>8.</b> All the Request,Response and any other object which could be shared among the services where the service is called should be moved to ms-common instead of writing in each service.</br>
<b>9.</b> Don't repeat code.</br>
