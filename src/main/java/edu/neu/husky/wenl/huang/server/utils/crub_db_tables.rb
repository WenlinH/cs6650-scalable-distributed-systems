require 'mongo'
client = Mongo::Client.new(['localhost:27017'])
# client = Mongo::Client.new(['34.215.15.228:27017'])
db = Mongo::Database.new(client, 'ski-records')

##############################################################################
#                            Deleting Collections                            #
##############################################################################

db.drop

#-----------------------------------------------------------------------------

##############################################################################
#                            Creating Indexes                                #
##############################################################################

db['lift-records'].indexes.create_one(skierId: 1)
db['daily-ski-records'].indexes.create_one(skierId: 1)
