# docker file

# first stage of building angular image
FROM node:lts as build
RUN mkdir -p /app

WORKDIR /app

COPY package.json /app
RUN npm install

COPY . /app/
RUN npm run buils --prod

# final stage
FROM nginx:stable
COPY --from=build /app/dist/front_end /usr/share/nginx/html