# Configuration file

The Clovertonemusic.com server requires the existence of a file called `config.edn` in the `data/` directory (relative to the server root directory). Here is an example file:


```
{
  ;; Should be one of `:dev`, `:test`, `:prod`. If `:env` is defined as (for example) `:dev`, then
  ;; the `:dev` key will be used when looking up all of the other configuration parameters.
  :env :dev

  ;; Should be one of :debug, :info, :warn, :error, :fatal
 :log-level {:dev :debug
             :test :info
             :prod :info}

 ;; The server URL:
 :http-server {:dev "127.0.0.1:8090"
               :test "dev.clovertonemusic.com"
               :prod "clovertonemusic.com"}

 :http-prefix {:dev "http://"
               :test "https://"
               :prod "https://"}

 ;; Connection details for the smtp server. When nil, then the local UNIX mail system will be
 ;; utilised:
 :smtp-server {:dev nil
               :test {:host "smtp.server.com"
                      :port 999
                      :user "user"
                      :pass "pass"
                      :ssl true
                      :tls true}
               :prod {:host "smtp.server.com"
                      :port 999
                      :user "user"
                      :pass "pass"
                      :ssl true
                      :tls true}}

 ;; The email address of users who are considered to be site administrators. Use one of these
 ;; logins to perform various administration tasks, such as manually entering purchases for users:
 :site-admins ["EMAIL_ADDRESS_1" "EMAIL_ADDRESS_2"]

 ;; Email address for Clovertonemusic customer support, used in from and to fields in emails and
 ;; on various pages:
 :support-email-address {:dev "EMAIL_ADDRESS"
                         :test "EMAIL_ADDRESS"
                         :prod "EMAIL_ADDRESS"}

 ;; Used for notifying system administrators of important errors and events:
 :noreply-from-email-address "EMAIL_ADDRESS"

 ;; The from address for activation emails to new users:
 :activation-from-email-address {:dev "EMAIL_ADDRESS"
                                 :test "EMAIL_ADDRESS"
                                 :prod "EMAIL_ADDRESS"}

 ;; Email address to notify of error events:
 :admin-errors-email-address {:dev "EMAIL_ADDRESS"
                              :test "EMAIL_ADDRESS"
                              :prod "EMAIL_ADDRESS"}

 ;; List of email addresses that should be notified of significant events:
 :admin-ops-email-list {:dev ["EMAIL_ADDRESS"]
                        :test ["EMAIL_ADDRESS"]
                        :prod ["EMAIL_ADDRESS_1" "EMAIL_ADDRESS_2"]}

 ;; If an email address is defined (or not nil) in this map for a given environment, then that
 ;; address will be used as the recipient on outgoing emails in lieu of the actual recipient.
 :recipient-email-address {:dev "EMAIL_ADDRESS"
                           :test "EMAIL_ADDRESS"
                           :prod nil}

 :stripe-api-keys {:dev {:publishable "PUBLISHABLE_KEY"
                         :secret "SECRET_KEY"}
                   :test {:publishable "PUBLISHABLE_KEY"
                          :secret "SECRET_KEY"}
                   :prod {:publishable "PUBLISHABLE_KEY"
                          :secret "SECRET_KEY"}}

 ;; Info required to read the catalogue and users/purchases dbs from the Google Drive:
 :remote-drive-name "RCLONE_DRIVE_NAME:"
 :catalogue-xlsx-name "ClovertoneMusicCatalogue.xlsx"
 :users-and-purchases-xlsx-name "ClovertoneMusicUsersAndPurchases.xlsx"

 ;; This is used in the body of the emails sent to the operations team:
 :users-and-purchases-link "SHARABLE_LINK_TO_USERS_AND_PURCHASES_EXCEL_FILE_IN_GOOGLE_DRIVE"}
```
