const Router = require('hermesjs/lib/router');
const {validateMessage} = require('../../lib/message-validator');
const router = new Router();
const testTaxinycYourUniqueNameBackofficePaymentChargedV1AcceptedHandler = require('../handlers/test-taxinyc-YOUR_UNIQUE_NAME-backoffice-payment-charged-v1-accepted');
module.exports = router;

router.use('test/taxinyc/YOUR_UNIQUE_NAME/backoffice/payment/charged/v1/accepted', async (message, next) => {
  try {
    await validateMessage(message.payload,'test/taxinyc/YOUR_UNIQUE_NAME/backoffice/payment/charged/v1/accepted','PaymentCharged','publish');
    await testTaxinycYourUniqueNameBackofficePaymentChargedV1AcceptedHandler.receivePaymentCharged({message});
    next();
  } catch (e) {
    next(e);
  }
});
